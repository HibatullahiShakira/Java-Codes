import java.util.Scanner;

	public class BinaryHub {

		public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
	


		System.out.println("Welcome to binary hub");
		
		System.out.println("How many times would you like play");
		int timePlay = scanner.nextInt();

		int counter = 1 ;

		while(counter < timePlay) {


		System.out.println("Enter either 1 or 0");
		int number = scanner.nextInt();

		if (number == 1) {

		System.out.println("0");
		}

		else {

		if  (number == 0) {

		System.out.println("1");

		counter++;

			}
		}
				
		}
	}
}