package by.htp.fortuneTeller.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import by.htp.fortuneTeller.bean.Chamomile;

public class FortuneTeller {

	private Map<String, List<String>> map = new HashMap<String, List<String>>();

	public int addUser() {

		System.out.println("Even number from 1 to 3");
		System.out.println("\t1 - Love");
		System.out.println("\t2 - Money");
		System.out.println("\t3 - Happinnes");
		Scanner scanner = new Scanner(System.in);
		int choise = scanner.nextInt();
		if (choise <= 0 || choise > 3) {
			System.out.println("Wrong choise, Even number from 1 to 3");
			scanner.close();
		} else
			System.out.println("Your prediction is: ");
		return choise;
	}

	public void initializationEvents() {

		List<String> setLove = new ArrayList<String>();

		setLove.add("Love");
		setLove.add("Not Love");
		setLove.add("Big Love");
		setLove.add("Unrequited Love");

		List<String> setMoney = new ArrayList<String>();

		setMoney.add("Money");
		setMoney.add("No Money");

		List<String> setHappy = new ArrayList<String>();

		setHappy.add("Happy");
		setHappy.add("No Happy");

		map.put("Love", setLove);
		map.put("Money", setMoney);
		map.put("Happinnes", setHappy);

	}

	public void readFortune(Chamomile chamomile) {

		if (chamomile.getPetal() <= 0) {
			System.out.println("Take new flower");
			return;
		}

		switch (addUser()) {
		case 1:
			if (chamomile.getPetal() % map.get("Love").size() == 0) {
				System.out.println(map.get("Love").get(3));
			} else if (chamomile.getPetal() % map.get("Love").size() == 1) {
				System.out.println(map.get("Love").get(0));
			} else if (chamomile.getPetal() % map.get("Love").size() == 2) {
				System.out.println(map.get("Love").get(1));
			} else if (chamomile.getPetal() % map.get("Love").size() == 3) {
				System.out.println(map.get("Love").get(2));
			}
			break;
		case 2:
			if (chamomile.getPetal() % map.get("Money").size() == 0) {
				System.out.println(map.get("Money").get(1));
			} else {
				System.out.println(map.get("Money").get(0));
			}
			break;
		case 3:
			if (chamomile.getPetal() % map.get("Happinnes").size() == 0) {
				System.out.println(map.get("Happinnes").get(1));
			} else {
				System.out.println(map.get("Happinnes").get(0));
			}
			break;
		}
	}
}
