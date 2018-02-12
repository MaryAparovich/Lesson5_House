package by.htp.home.model;

public class Door {

	private String color;
	private int width;
	private int height;
	private boolean opened = true; //����� �������/�������
	private boolean locked = false; //����� �������/������� �� ����

	public void open() {
		if (opened == true) {
			System.out.println("���������� ��������� ! ����� ��� �������");
		} else {
			if (locked == true) {
				System.out.println("���������� ��������� ! ����� ������� �� ����!");
			} else {
				opened = true;
				System.out.println("��������� �����...");
			}
		}
	}

	/**
	 * ������� �����, �� �� �� ����
	 */
	public void close() {
		if (opened == false) {
			System.out.println("���������� ��������� ! ����� ��� �������");
		} else {
			opened = false;
			System.out.println("��������� �����...");
		}
	}

	/**
	 * ������� �� ����
	 */
	public void lock() {
		if (locked == true) {
			System.out.println("���������� ��������� ! ����� ��� ������� �� ����!");
		} else {
			if (opened == true) {
				System.out.println("���������� ��������� ! �������� �����, ����� ������� �� ����");
			} else {
				locked = true;
				System.out.println("��������� ����� �� ����...");
			}
		}
	}

	/**
	 * ������� ����� �����
	 */
	public void unLock() {
		if (opened == true) {
			System.out.println("���������� ��������� ! ����� �������, �� ��������� �������� ������");
		} else {
			// ���� ������� �� ����
			if (locked == true) {
				locked = false;
				System.out.println("��������� ����� �����...");
			} else {
				System.out.println("���������� ��������� ! ����� ��� ������");
			}
		}
	}

	public void getState() {
		if (opened == true && locked == true) {
			System.out.println("��������� �����: �������� ���������");
		} else if (opened == true && locked == false) {
			System.out.println("��������� �����: ����� �������");
		} else if (opened == false && locked == true) {
			System.out.println("��������� �����: ����� �������, ����� ������");
		} else if (opened == false && locked == false) {
			System.out.println("��������� �����: ����� �������, ����� ������");
		}
	}
}
