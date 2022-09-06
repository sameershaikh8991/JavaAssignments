package mypack;

class Data{
	public String name="sameer";
	static int id=19;
}

public class InstanceStatic {
	public static void main(String[] args) {
		Data r= new Data();
		System.out.println("Name:"+r.name);
		System.out.println("ID: "+Data.id);
	}
}

