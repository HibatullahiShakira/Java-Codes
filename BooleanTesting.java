import java.util.Scanner;

	public class BooleanTesting {

		public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number: ");
	int number = scanner.nextInt();

		boolean evenNumber = true;
		boolean oddNumber = false;

	if (number % 2 == 0) 
		System.out.println(evenNumber);

	if (number % 2 > 0) 
		System.out.println(oddNumber);

			}
		}

	