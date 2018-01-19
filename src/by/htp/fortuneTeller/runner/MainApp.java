package by.htp.fortuneTeller.runner;

import by.htp.fortuneTeller.bean.Chamomile;
import by.htp.fortuneTeller.logic.FortuneTeller;

public class MainApp {

	public static void main(String[] args) {

		Chamomile chamomile = new Chamomile(3);

		FortuneTeller teller = new FortuneTeller();

		teller.initializationEvents();
		teller.readFortune(chamomile);
	}
}
