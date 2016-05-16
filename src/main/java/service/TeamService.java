package service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import entity.Team;
import entity.TeamInfo;
import utils.Properties;

public class TeamService {

	public TeamInfo[] list(String query) {

		ClientConfig config = new DefaultClientConfig();
		config.getClasses().add(JacksonJsonProvider.class);
		Client client = Client.create(config);

		WebResource service = client.resource(UriBuilder.fromUri(Properties.URI).build());

		TeamInfo[] teams = service.path(Properties.TEAMS_PATH).queryParam(Properties.QUERY_PARAM_KEY, query)
				.accept(MediaType.APPLICATION_JSON).get(TeamInfo[].class);

		return teams;
	}

	public Team get(String slug) {

		ClientConfig config = new DefaultClientConfig();
		config.getClasses().add(JacksonJsonProvider.class);
		Client client = Client.create(config);

		WebResource service = client.resource(UriBuilder.fromUri(Properties.URI).build());

		Team team = service.path(Properties.TEAM_PATH).path(slug).accept(MediaType.APPLICATION_JSON).get(Team.class);

		return team;
	}

}
