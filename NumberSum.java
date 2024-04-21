import java.util.Scanner;
	public class NumberSum {
	
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
		
			int continueOrExist;
			int number;
			int totalSum = 0;
			int count = 0;
			do {

			System.out.println("Enter First number: ");
			 number = scanner.nextInt();

			System.out.println("Enter Second number: ");
			int secondNumber = scanner.nextInt();

			totalSum = number + secondNumber;

			System.out.println("Total of the two digits is: " + totalSum);

			System.out.println("To continue enter 1 and to exist enter 0: ");
			continueOrExist = scanner.nextInt();
			++count;
			} while(continueOrExist != 0);
		

			}
		}
			