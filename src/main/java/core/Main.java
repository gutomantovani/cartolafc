package core;

import entity.Team;
import service.TeamService;

public class Main {

	public static void main(String[] args) {
		TeamService service = new TeamService();
		Team team = service.get("sep-guto-mantovani");

		System.out.println("Feito");
	}

}
