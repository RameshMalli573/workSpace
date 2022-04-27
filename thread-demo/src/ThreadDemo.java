
public class ThreadDemo {
	public static void main(String[] args) {
		Worker1 t1 = new Worker1();
		t1.run();
	}
}

//using Runnable Interface
class Worker1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().toString() + i);
		}
	}


}

//using Thread Class
class Worker extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().toString() + i);
		}
	}
}
