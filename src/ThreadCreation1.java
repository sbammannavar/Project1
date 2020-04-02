
public class ThreadCreation1 extends Thread {

	
	public ThreadCreation1(String threadName) {
	super(threadName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadCreation1 thread = new ThreadCreation1("Thread1");
		thread.start();
		//thread.run();
		System.out.println(String.format("%s running", Thread.currentThread().getName()));
		}
   public void run() {
	   System.out.println(String.format("%s is running", Thread.currentThread().getName()));
   }
}
