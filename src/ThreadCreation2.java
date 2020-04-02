
public class ThreadCreation2 implements Runnable {

	public void run() {System.out.println(String.format("%s running", Thread.currentThread().getName()));}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s is running", Thread.currentThread().getName()));
		ThreadCreation2 threadCreation2 = new ThreadCreation2();
		Thread thread = new Thread(threadCreation2, "Thread2");
		thread.start();
	}

}
