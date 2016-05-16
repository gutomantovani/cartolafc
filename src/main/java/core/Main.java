package core;

import entity.RoundInfo;
import service.RoundService;

public class Main {

	public static void main(String[] args) {
		RoundService service = new RoundService();
		RoundInfo[] team = service.list();

		System.out.println("Feito");
	}

}
