public class StudentInfo {
	 int studentNo;
	 long fees;
	 String  studentName,studentMailId,studentAddress;
	StudentInfo(int studentNo,String studentName,String studentMailId,String studentAddress,long fees){
		this.studentNo=studentNo;
		this.studentName=studentName;
		this.studentMailId=studentMailId;
		this.studentAddress=studentAddress;
		this.fees=fees;
	}
	void fees (int studentNo,long fees) {
		if (fees<2000) {
			fees=fees+((fees*10)/100);
		}
		System.out.println("New Fees : "+fees);
	}
	void display(int studentNumber) {
		System.out.println("Student No. : "+studentNumber);
		System.out.println("Student name : "+studentName);
		System.out.println("Student Mail : "+studentMailId);
		System.out.println("Address : "+studentAddress);
		System.out.println("Old fees : "+fees);
		fees(studentNumber,fees);
	}
	
}
class StudentDetail{
	public static void main(String[] args) {
		StudentInfo[] st= {new StudentInfo(1, "Sankalpa", "Sankalpa@gmail.com", "Uttarpara",1500),new StudentInfo(2, "Tathagata", "Tathagata@gmail.com", "kolkata",2330),
					   new StudentInfo(3, "Mainak","mainak@gmail.com", "Howrah",1978),new StudentInfo(4, "Debjit", "debjit@gmail.com", "Nadia",2000),
					   new StudentInfo(5, "Bibek", "ganesh@gmail.com", "Malda",2318)};
		for (int i=0;i<st.length;i++) {
			st[i].display(st[i].studentNo);;
		}
		
}}