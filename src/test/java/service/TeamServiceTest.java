package service;

import org.junit.Assert;
import org.junit.Test;

import entity.Team;
import entity.TeamInfo;

public class TeamServiceTest {

	private TeamService teamService = new TeamService();

	@Test
	public void testList() {

		TeamInfo[] list = teamService.list("guto mantovani");

		Assert.assertNotNull(list);
		Assert.assertTrue(list.length >= 1);
		Assert.assertTrue(list[0].getId() > 0);
	}

	@Test
	public void testGet() {

		Team team = teamService.get("sep-guto-mantovani");

		Assert.assertNotNull(team);
		Assert.assertTrue(team.getTeamInfo().getSlug().equals("sep-guto-mantovani"));
	}

}
