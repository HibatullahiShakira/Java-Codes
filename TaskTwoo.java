import java.util.Scanner;

	public class TaskTwoo {

		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		for(int i = 1; i <= 10; i++) {

		System.out.println("Enter scores: "); 
		int number = scanner.nextInt();
		
		sum += number;
		
		}
		
		int average = sum / 10;
		System.out.printf("The sum is %d", sum);
		System.out.printf("The average is %d", average);
		
	}
}