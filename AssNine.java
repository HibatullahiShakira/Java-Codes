import java.util.Scanner;
	public class AssNine {
	
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
			

			System.out.println("Enter number: ");
			int number = scanner.nextInt();


			int factorial = 1;
			int counter = 2;

			for (int count = 1; count <= number; ++count) {

				factorial = factorial * count;

			
				}
			System.out.println("fatorial of numbers: " +factorial);

			}
		}
			