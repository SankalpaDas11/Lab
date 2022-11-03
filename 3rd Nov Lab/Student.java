// Q.1 Wrapper class activity

public class Student { 			// class with name 'Student' created
	
	//1st method
	public void calculateFeesStructure(long studentId, char studentGrade, 
					   double monthlyFees, boolean isScholarshipEligible) {		 	// method to calculate fees
		
		//checking criteria
		if(studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) {				//checking if the grade is A
			 double fees =monthlyFees -monthlyFees *10/100;
			 System.out.println("10% of fees is exempted, the calculated fees is  " + (int)fees);
		}
		else if (studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) { 			//checking if the grade is B
			 double fees =monthlyFees -monthlyFees * 8/100 ; 
			 System.out.println("8% of fees is exempted, the calculated fees is  " + (int)fees);
		}
		else if (studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) { 			//checking if the grade is C
			 double fees =monthlyFees -monthlyFees * 6/100 ; 
			 System.out.println("6% of fees is exempted, the calculated fees is  " + (int)fees);
		}
		else if (studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) { 			//checking if the grade is D
			 double fees =monthlyFees -monthlyFees * 4/100 ; 
			 System.out.println("4% of fees is exempted, the calculated fees is  " + (int)fees);
		}
		else {												//if none of the condition is satisfied
			System.out.println("Not Eligible for Exemption"); 
		}
	}
	
	//2nd method
	public void compareMarks(long Maths, double English) {				 // method to compare marks
		
		//criteria
		if((int)English > (int)Maths) {
			System.out.println("English mark is higher than Maths"); 
		}
		else if((int)Maths > (int)English) {
			System.out.println("Maths mark is higher than English");
		}
		else if((int)English == (int)Maths) {
			System.out.println("Both are equal");
		}
	}
	
	//3rd method
	public void validateFees(Double Fees) { 					// method to validate whether fees is finite or not
        if(Fees.isInfinite()) { // logic to check
           System.out.println("Fees is infinite");
        }
       else {
           System.out.println("Fees is not infinite");
       }
        System.out.println(Fees.byteValue()); 						//printing byte value of fees
    }
	
	public static void main(String[] args) { 					// main method 
		
		Student student = new Student();					//object of the Student class
		
		//calling 1st method with given inputs
		student.calculateFeesStructure(234,'C',600,true);	
		student.calculateFeesStructure(115,'B',909.50,true);
		student.calculateFeesStructure(980,'G',1810,false);
		
		//calling 2nd method with given inputs
		student.compareMarks(85,65);
		student.compareMarks(56,98);
		student.compareMarks(84,84);
		
		//calling 3rd method
		student.validateFees(100d);
	}
}
