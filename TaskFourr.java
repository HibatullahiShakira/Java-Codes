import java.util.Scanner;

	public class TaskFourr {

		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int totalEvenIndexes = 0;
		int scores;
		for(int i = 1; i <= 10; i++) {

		System.out.println("Enter scores: "); 
		scores = scanner.nextInt(); 
		
			if(i % 2 == 0) {
				totalEvenIndexes += scores; 
			}
		}
		System.out.printf("The sum of even number is %d", totalEvenIndexes);
		
	}	
		
}