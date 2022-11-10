import java.util.ArrayList;

class LoaderThread implements Runnable{
	int startNumber, lastNumber;
	LoaderThread(int startNumber, int lastNumber){
		this.startNumber = startNumber;
		this.lastNumber = lastNumber;
	}
	public void run() {
		ArrayList<Integer>L=new ArrayList<Integer>();
		for(int i=startNumber;i<=lastNumber;i++) {
				L.add(i);
				//System.out.println(L.get(i));
		}
		System.out.println(L);
	}
}

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = new LoaderThread(0, 50);
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new LoaderThread(50, 100);
		Thread t2 = new Thread(r2);
		
		int a = (int) System.currentTimeMillis(); // time taken before executing
		System.out.println("Response time before executing loadList method : " + a);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		int b = (int) System.currentTimeMillis(); //time taken after executing
		System.out.println("Response time after executing loadList method : " + b);
		System.out.println("Response time : " + (b-a));
	}
}
