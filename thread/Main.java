package thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildThread t1=new ChildThread();

		ChildThreadChild t2=new ChildThreadChild();
		
		System.out.println(t2);
		t2.setName("ChildThread");
		System.out.println(t2.getName());
		t2.setPriority(7);
		System.out.println(t2.getPriority());
	}

}
