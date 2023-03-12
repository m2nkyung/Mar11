class ThreadX extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadR extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Week13_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadX t1 = new ThreadX();
		Runnable r = new ThreadR();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}