package service;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import entity.Club;

public class ClubServiceTest {

	private ClubService clubService = new ClubService();

	@Test
	public void testGetMap() {

		HashMap<String, Club> clubMap = clubService.getMap();

		Assert.assertNotNull(clubMap);
		Assert.assertTrue(clubMap.size() > 0);
	}

}
