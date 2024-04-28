import java.util.Arrays;
import java.util.Scanner;
	
	public class FireDrillD {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[10];

		for(int i = 0; i < 10; i++) {
			
		System.out.println("Enter scores: ");
		scores [i] = scanner.nextInt();
		int []minimumNumbers =  FireDrillFunctions.taskFive(scores);
		}
			System.out.print(minimumNumbers);

	}
}
