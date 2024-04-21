import java.util.Scanner;
	
	public class GuessNumber {

		public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to lucky bet");

		System.out.println("How many time would you like to play");
		int payTime = scanner.nextInt();
		
		int number = 23;
		int counter = 1;

		 while (counter < payTime) {
	
		System.out.println("Enter lucky number");
 		int luckyNumber = scanner.nextInt();

		
		if (luckyNumber == number) {
		System.out.println(" You are correct ");
		}

		else {
		if  (luckyNumber < number) {
		System.out.println(" lucky number too low ");
		}

		else {
		if (luckyNumber > number) {
		System.out.println(" lucky number too high ");
		counter++;
			}

		}

			}


		}
	}
		}
	
			


		


	
		