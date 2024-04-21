import java.util.Scanner;

	public class chapterthree8 {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Enter Number: ");
		int factorialNumber = scanner.nextInt();
			for(int count = 1; count <= factorialNumber; count++) {
				factorial *= count;
			}
	System.out.println("The factorial of " +  factorialNumber + " is " + factorial);
		}
	}