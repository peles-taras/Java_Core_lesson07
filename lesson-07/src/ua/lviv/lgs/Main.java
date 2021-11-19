package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {

		Su27 su27 = new Su27(25, 8, 5000, 900, "white");

		System.out.println(su27);
		System.out.println("");

		su27.startEngine();
		su27.planeTakeOff();
		su27.MoveUp();
		su27.MoveLeft();
		su27.MoveDown();
		su27.MoveRight();
		su27.nuclearStrike();
		su27.stealthTechnology();
		su27.turboSpeedUp();
		su27.planeLanding();
	}
}
