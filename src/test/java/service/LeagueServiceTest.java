package service;

import org.junit.Assert;
import org.junit.Test;

import entity.League;

public class LeagueServiceTest {

	private LeagueService leagueService = new LeagueService();

	@Test
	public void testList() {

		League[] list = leagueService.list("FATEC MOCOCA 2016");

		Assert.assertNotNull(list);
		Assert.assertTrue(list.length == 1);
		Assert.assertTrue(list[0].getName().equals("FATEC MOCOCA 2016"));
	}

}
