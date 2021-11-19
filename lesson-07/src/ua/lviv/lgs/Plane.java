package ua.lviv.lgs;

public abstract class Plane extends PlaneControl {
	private int width;
	private int height;
	private int weight;

	public Plane(int width, int height, int weight) {
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public void startEngine() {
		System.out.println("Двигуни запущено, до готовності взлетіти: "
				+ Math.floor(Math.random() * ((super.getMax() - 912) - super.getMin()) + super.getMin()) + " сек.");
	}

	public void planeTakeOff() {
		System.out.println("Літак взлетів, проїде: "
				+ Math.floor(Math.random() * (super.getMax() - super.getMin() + 1) + super.getMin()) + " км.");
	}

	public void planeLanding() {
		System.out.println("Літак іде на посадку");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
