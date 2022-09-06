package mypack;
class Demo {
	static void  display() {
		System.out.println("sameer shaikh");
	}
}

public class StaticDemo {
	static int a = 40;

	int b = 50;

	void simpleDisplay()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void staticDisplay()
	{
	System.out.println("form static method");
	}

	// main method
	public static void main(String[] args)
	{
		StaticDemo obj = new StaticDemo();
		obj.simpleDisplay();

		//static method.
		staticDisplay();
		Demo.display();
	}
}
