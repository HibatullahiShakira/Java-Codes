import java.util.Scanner;
 
	public class StudentScore {

		public static void main(String [] args){
			Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter user name");
 		String userName = scanner.nextLine();

		int counter = 1;
		while(counter < 23) {		
			
		System.out.println("Enter score 1");
		int score1 = scanner.nextInt();
		
		System.out.println("Enter score 2");
		int score2 = scanner.nextInt();
		
		System.out.println("Enter score 3");
		int score3 = scanner.nextInt();
		 
		int totalScore = score1 + score2 + score3;
		System.out.printf("userName: %s, Total Score: %d\n", userName, totalScore);
 		
		if (totalScore >= 80) {
		System.out.println(" Grade: A ");
		}
		
		else {
		if  (totalScore >= 70) {
		System.out.println(" Grade: B ");
		}

		else {
		if (totalScore >= 50) {
		System.out.println(" Grade: C ");
		}

		else {
		 if (totalScore >= 40); {
		System.out.println(" Grade: D ");
			}
		
		System.out.println(" Failed ");
		counter++;
			}
	}
	}
	}
		
   }
}

		
		

 		
 