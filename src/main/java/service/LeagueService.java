package service;

import javax.ws.rs.core.MediaType;

import entity.League;
import utils.Properties;

public class LeagueService extends AbstractService {

	public League[] list(String query) {

		League[] leagues = service.path(Properties.LEAGUES_PATH).queryParam(Properties.QUERY_PARAM_KEY, query)
				.accept(MediaType.APPLICATION_JSON).get(League[].class);

		return leagues;
	}

}
