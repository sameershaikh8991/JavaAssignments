package mypack;

abstract class vehicle{
	public abstract void carName();
	void carTopSpeed() {
		int speed=100;
		System.out.println(speed);
	}
}

class Car extends vehicle{
	public void carName() {
		System.out.println("BNW");
	}
}

public class Absract {
	public static void main(String[] args) {
		Car c = new Car();
		c.carName();
	}
}
