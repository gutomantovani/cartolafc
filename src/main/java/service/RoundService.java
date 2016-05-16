package service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import entity.Round;
import entity.RoundInfo;
import utils.Properties;

public class RoundService {

	public RoundInfo[] list() {

		ClientConfig config = new DefaultClientConfig();
		config.getClasses().add(JacksonJsonProvider.class);
		Client client = Client.create(config);

		WebResource service = client.resource(UriBuilder.fromUri(Properties.URI).build());

		RoundInfo[] rounds = service.path(Properties.ROUNDS_PATH).accept(MediaType.APPLICATION_JSON)
				.get(RoundInfo[].class);

		return rounds;
	}

	public Round get() {

		ClientConfig config = new DefaultClientConfig();
		config.getClasses().add(JacksonJsonProvider.class);
		Client client = Client.create(config);

		WebResource service = client.resource(UriBuilder.fromUri(Properties.URI).build());

		Round round = service.path(Properties.MATCHS_PATH).accept(MediaType.APPLICATION_JSON).get(Round.class);

		return round;
	}

}
