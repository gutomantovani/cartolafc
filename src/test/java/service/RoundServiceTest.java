package service;

import org.junit.Assert;
import org.junit.Test;

import entity.Round;
import entity.RoundInfo;

public class RoundServiceTest {

	private RoundService roundService = new RoundService();

	@Test
	public void testList() {

		RoundInfo[] list = roundService.list();

		Assert.assertNotNull(list);
		Assert.assertTrue(list.length == 1);
		Assert.assertTrue(list[0].getId() > 0);
	}

	@Test
	public void testGet() {

		Round round = roundService.get();

		Assert.assertNotNull(round);
		Assert.assertTrue(round.getRound() > 0);
	}

}
