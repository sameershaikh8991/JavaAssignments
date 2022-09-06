package thread;

public class ChildThread extends Thread {
	public ChildThread(){
		
	}
	
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println(i);
		}
	}
}
