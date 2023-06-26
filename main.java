import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
	//Advanced grade calculation
		
	Scanner scanner = new Scanner(System.in);
	
	 System.out.println("Please enter vize 1 score");
	 int vize1 = scanner.nextInt();
	 
	 System.out.println("Please enter vize 2 score");
	 int vize2 = scanner.nextInt();
	 
	 System.out.println("Please enter final score");
	 int final1 = scanner.nextInt();
	 
	 System.out.println("Please enter your GPA (Example: 2.50)");
	 double gpa = scanner.nextDouble();
	 
	 double totalscore = (vize1 * 3/10.0) + (vize2 * 3/10.0) + (final1 * 4/10.0 );
	 
	 
	 if(totalscore >= 90) {
		 System.out.println("AA");
	 }
	 
	 else if(totalscore >= 85) {
		 System.out.println("BA");
	 }
	 
	 else if(totalscore >= 80) {
		 System.out.println("BB");
	 }
	 
	 else if(totalscore >= 75) {
		 System.out.println("CB");
	 }
     
	 else if(totalscore >= 70) {
		 System.out.println("CC");
	 }
		
	 else if(totalscore >= 65) {
		 System.out.println("DC");
	 }
	 
	 
	 else if(totalscore >= 60 ) {
		 System.out.println("DD");
		 
		 if(gpa < 2.50) {
			 System.out.println("Your GPA is low, You can consider taking the course again...");
		 }
	 }
		 
	 
	 else if(totalscore >= 55) {
		 System.out.println("FD");
	 }
	 
	 else {		
		 System.out.println("FF");
	 }

	 
	 
	}

}
