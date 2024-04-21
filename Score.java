import java.util.Scanner;
 
	public class Score {

		public static void main(String [] args){
			Scanner scanner = new Scanner(System.in);


		System.out.println("Enter user name");
 		String userName = scanner.nextLine();

		System.out.println("Enter score 1");
		int score1 = scanner.nextInt();
		
		System.out.println("Enter score 2");
		int score2 = scanner.nextInt();
		
		System.out.println("Enter score 3");
		int score3 = scanner.nextInt();
		 
		int totalScore = score1 + score2 + score3;
			System.out.printf("userName: %s, Total Score: %d", userName, totalScore);
 
		if (totalScore >= 100) {
			System.out.println(" invalid calculation ");
			}
		else {
			System.out.println( " total score " );
			}
			
			
}
}