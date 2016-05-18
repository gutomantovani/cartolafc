package service;

import javax.ws.rs.core.MediaType;

import entity.Team;
import entity.TeamInfo;
import utils.Properties;

public class TeamService extends AbstractService {

	public TeamInfo[] list(String query) {

		TeamInfo[] teams = service.path(Properties.TEAMS_PATH).queryParam(Properties.QUERY_PARAM_KEY, query)
				.accept(MediaType.APPLICATION_JSON).get(TeamInfo[].class);

		return teams;
	}

	public Team get(String slug) {

		Team team = service.path(Properties.TEAM_PATH).path(slug).accept(MediaType.APPLICATION_JSON).get(Team.class);

		return team;
	}

}
