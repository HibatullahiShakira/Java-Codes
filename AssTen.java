import java.util.Scanner;
	public class AssTen {
	
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
				
			int totalSum = 0;
			int count = 0;
			do {

			System.out.println("Enter First number: ");
			int number = scanner.nextInt();

			System.out.println("Enter Second number: ");
			int secondNumber = scanner.nextInt();

			totalSum = number + secondNumber;

			System.out.println("To continue enter 1 and to exist enter 0: ");
			int continueOrExist = scanner.nextInt();
			++count;
			} while(number != 0);

			System.out.println("Total of the two digits is: " + totalSum);
				

			}
		}
			