import java.util.Scanner;

	public class TaskOnee {

		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		for(int i = 1; i <= 10; i++) {

		System.out.println("Enter number: "); 
		int number = scanner.nextInt();
		
		sum += number;
		
		}
		System.out.printf("%d", sum);
		
	}
}