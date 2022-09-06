package mypack;

class Cat {
	void info() {
		System.out.println("car");
	}
}

class Persiancat extends Cat {
//	@Override
	void info() {
		System.out.println("Persian cat");
	}
}

class UpcastingA {
	public static void main(String args[]) {

		Cat o = (Cat) new Persiancat();
//		Persiancat 
		o.info();
	}
}