package service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import entity.League;
import utils.Properties;

public class LeagueService {

	public League[] list(String query) {

		ClientConfig config = new DefaultClientConfig();
		config.getClasses().add(JacksonJsonProvider.class);
		Client client = Client.create(config);

		WebResource service = client.resource(UriBuilder.fromUri(Properties.URI).build());

		League[] leagues = service.path(Properties.LEAGUES_PATH).queryParam(Properties.QUERY_PARAM_KEY, query)
				.accept(MediaType.APPLICATION_JSON).get(League[].class);

		return leagues;
	}

}
