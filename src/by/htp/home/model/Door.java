package by.htp.home.model;

public class Door {

	private String color;
	private int width;
	private int height;
	private boolean opened = true; //дверь открыта/закрыта
	private boolean locked = false; //дверь закрыта/открыта на ключ

	public void open() {
		if (opened == true) {
			System.out.println("Невозможно выполнить ! Дверь уже открыта");
		} else {
			if (locked == true) {
				System.out.println("Невозможно выполнить ! Дверь закрыта на ключ!");
			} else {
				opened = true;
				System.out.println("Открываем дверь...");
			}
		}
	}

	/**
	 * закрыть дверь, но не на ключ
	 */
	public void close() {
		if (opened == false) {
			System.out.println("Невозможно выполнить ! Дверь уже закрыта");
		} else {
			opened = false;
			System.out.println("Закрываем дверь...");
		}
	}

	/**
	 * закрыть на ключ
	 */
	public void lock() {
		if (locked == true) {
			System.out.println("Невозможно выполнить ! Дверь уже закрыта на ключ!");
		} else {
			if (opened == true) {
				System.out.println("Невозможно выполнить ! Закройте дверь, чтобы закрыть на ключ");
			} else {
				locked = true;
				System.out.println("Закрываем дверь на ключ...");
			}
		}
	}

	/**
	 * открыть замок двери
	 */
	public void unLock() {
		if (opened == true) {
			System.out.println("Невозможно выполнить ! Дверь открыта, не требуется открытие ключом");
		} else {
			// если закрыта на ключ
			if (locked == true) {
				locked = false;
				System.out.println("Открываем замок двери...");
			} else {
				System.out.println("Невозможно выполнить ! Замок уже открыт");
			}
		}
	}

	public void getState() {
		if (opened == true && locked == true) {
			System.out.println("Состояние двери: неверное состояние");
		} else if (opened == true && locked == false) {
			System.out.println("Состояние двери: дверь открыта");
		} else if (opened == false && locked == true) {
			System.out.println("Состояние двери: дверь закрыта, замок закрыт");
		} else if (opened == false && locked == false) {
			System.out.println("Состояние двери: дверь закрыта, замок открыт");
		}
	}
}
