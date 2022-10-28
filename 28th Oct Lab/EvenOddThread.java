/*Q.1 Create two threads to print even numbers and odd numbers from 1 to 100
 note: after printing of all even numbers only odd numbers should print*/

class MyThread1 extends Thread{//extending the thread class to create new thread 1
	public void run() {//creating run method
		System.out.println("The even numbers between 1 to 100 are : ");
		for(int i=1;i<=100;i++) {//running for loop to get the values from 1-100
			if(i%2==0) {//logic for even no
			System.out.println(i);
		}
			}
	}
}
class MyThread2 extends Thread{//extending the thread class to create new thread 2
	public void run() {//run method
		System.out.println("The odd numbers between 1 to 100 are : ");
		for(int i=1;i<=100;i++) {//running for loop to get the values from 1-100
			if(i%2!=0) {//logic for odd no
			System.out.println(i);
		}
			}
	}
}
public class EvenOddThread {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();//creating object of MyThread1
		t1.start();//to start the thread1
		try {
			t1.join();//waits for MyThread1 Thread to execute and end rather die
		} catch (InterruptedException e) {//catching exception if there any exception occurs
			e.printStackTrace();//printing the Exception
		}
		MyThread2 t2=new MyThread2();////creating object of MyThread1
		t2.start();//to start the thread2
}}