package service;

import java.util.HashMap;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import entity.Club;
import utils.Properties;

public class ClubService {

	public HashMap<String, Club> getMap() {

		ClientConfig config = new DefaultClientConfig();
		config.getClasses().add(JacksonJsonProvider.class);
		Client client = Client.create(config);

		WebResource service = client.resource(UriBuilder.fromUri(Properties.URI).build());

		@SuppressWarnings("unchecked")
		HashMap<String, Club> clubMap = service.path(Properties.CLUBS_PATH).accept(MediaType.APPLICATION_JSON)
				.get(HashMap.class);

		return clubMap;
	}

}
