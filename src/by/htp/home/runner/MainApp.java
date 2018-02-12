package by.htp.home.runner;

import by.htp.home.model.Door;
import by.htp.home.model.House;
import by.htp.home.model.Window;

public class MainApp {

	public static void main(String[] args) {

		House myNewHouse = new House(9, 15);

		System.out.println("Количество дверей = " + myNewHouse.getDoorsCount());
		System.out.println("Количество окон = " + myNewHouse.getWindowsCount());
		System.out.println();
		Door entranceDoor = myNewHouse.getEntranceDoor();
		
		if (entranceDoor != null) {
			entranceDoor.getState();
			entranceDoor.close();
			entranceDoor.getState();
			entranceDoor.lock();
			entranceDoor.getState();
		}
	}
}
