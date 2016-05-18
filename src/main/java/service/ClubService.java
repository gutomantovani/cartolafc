package service;

import java.util.HashMap;

import javax.ws.rs.core.MediaType;

import entity.Club;
import utils.Properties;

public class ClubService extends AbstractService {

	public HashMap<String, Club> getMap() {

		@SuppressWarnings("unchecked")
		HashMap<String, Club> clubMap = service.path(Properties.CLUBS_PATH).accept(MediaType.APPLICATION_JSON)
				.get(HashMap.class);

		return clubMap;
	}

}
