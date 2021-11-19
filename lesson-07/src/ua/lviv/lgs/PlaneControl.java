package ua.lviv.lgs;

public class PlaneControl {
	private int max;
	private int min;

	public PlaneControl() {
		this.max = 1000;
		this.min = 1;
	}

	public void MoveUp() {
		System.out.println("Рухаюсь вверх на: " + Math.floor(Math.random() * (max - min + 1) + min));
	}

	public void MoveDown() {
		System.out.println("Рухаюсь вниз на: " + Math.floor(Math.random() * (max - min + 1) + min));
	}

	public void MoveLeft() {
		System.out.println("Рухаюсь вліво на: " + Math.floor(Math.random() * (max - min + 1) + min));
	}

	public void MoveRight() {
		System.out.println("Рухаюсь вправо на: " + Math.floor(Math.random() * (max - min + 1) + min));
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

}
