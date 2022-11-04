// Q.2 Thread Activity

import java.util.ArrayList;
import java.util.List;

public class Thread1 {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>();

        double startTime = 0, endTime = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 10000000; i++) {
            numbers.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Total Required Time for Storing: " + (endTime - startTime));

        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 5000000; i++) {
                    System.out.println(numbers.get(i));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 5000000; i <= 10000000; i++) {
                    System.out.println(numbers.get(i));
                }
            }
        });
        startTime = 0; endTime = 0;
       startTime = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        startTime = System.currentTimeMillis();
        System.out.println("Total required time using thread: " + (startTime - endTime));
    }
}