import java.util.ArrayList;

public class ListLoader { 
	
		ArrayList<Integer>L=new ArrayList<Integer>();
		public void loadList(int startNumber, int lastNumber) {
			for(int i=startNumber;i<=lastNumber;i++) {
				L.add(i);
			}
		}
		 
		public static void main(String[] args) { //main method
			ListLoader ld = new ListLoader(); // creating object of the class
			int a = (int) System.currentTimeMillis(); // time taken before executing
			System.out.println("Response time before executing loadList method : " + a);
			ld.loadList(0,10000000);
			int b = (int) System.currentTimeMillis(); //time taken after executing
			System.out.println("Response time after executing loadList method : " + b);
			System.out.println("Response time : " + (b-a));
		}
}
