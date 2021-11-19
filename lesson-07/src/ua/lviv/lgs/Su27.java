package ua.lviv.lgs;

public class Su27 extends Plane implements TurboSpeedUp, StealthTechnology, NuclearStrike {

	private int maxSpeed;
	private String color;

	public Su27(int width, int height, int weight, int maxSpeed, String color) {
		super(width, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void nuclearStrike() {
		System.out.println("ʳ������ ������� ��������� �������: "
				+ Math.floor(Math.random() * ((super.getMax() - 990) - super.getMin() + 1) + super.getMin()));
	}

	@Override
	public void stealthTechnology() {
		System.out.println("Stealth ��������. ˳���� �� ����� ��������: "
				+ Math.floor(Math.random() * (super.getMax() - super.getMin() + 1) + super.getMin()) + " ���.");
	}

	@Override
	public void turboSpeedUp() {
		System.out.println("�������� ����� ��-27: "
				+ Math.floor(Math.random() * (super.getMax() - (super.getMin() + 900) + 1) + (super.getMin() + 900))
				+ " ��/���");
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Su27: ����������� ��������: " + maxSpeed + "��/���" + ", ����: " + color + ", �������: " + getWidth()
				+ "�." + ", ������: " + getHeight() + "�." + ", ����: " + getWeight() + "��.";
	}

}
