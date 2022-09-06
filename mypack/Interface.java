package mypack;

interface  vehicles{
	public void carName();
	
}

class Cars implements vehicles{
	public void carName() {
		System.out.println("Ferrari");
	}
}

public class Interface {
	public static void main(String[] args) {
		Cars c = new Cars();
		c.carName();
	}
}