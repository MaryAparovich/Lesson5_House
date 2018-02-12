package by.htp.home.model;

public class House {

	Door[] doorsArr;
	Window[] windowsArr;

	public House(int doorsCount, int windowsCount) {
		createDoors(doorsCount);
		createWindows(windowsCount);
	}

	public void createDoors(int doorsCount) {
		doorsArr = new Door[doorsCount];
		for (int i = 0; i < doorsCount; i++) {
			doorsArr[i] = new Door();
		}
	}

	public void createWindows(int windowsCount) {
		windowsArr = new Window[windowsCount];
		for (int i = 0; i < windowsCount; i++) {
			windowsArr[i] = new Window();
		}
	}

	public int getDoorsCount() {
		return doorsArr.length;
	}

	public int getWindowsCount() {
		return windowsArr.length;
	}

	public Door getEntranceDoor() {
		if (doorsArr != null && doorsArr.length != 0) {
			return doorsArr[0];
		}
		return null;
	}
}
