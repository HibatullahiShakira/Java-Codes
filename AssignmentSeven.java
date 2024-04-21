import java.util.Scanner;
		
	public class AssignmentSeven {


		public static void main(String [] args ) {
		Scanner scanner = new Scanner(System.in);
		
			
			System.out.println("How many times would you like to enter number: ");
			int enter = scanner.nextInt();

			for(int counter = 1; counter <= enter; counter++) {

			System.out.println("Enter the number");
			int number = scanner.nextInt();
			
				int smallest = Math.min((Math.min),number);
				int largest = Math.max((Math.max),number);
						}
			
					System.out.printf("The largest number is %d%n", largest);
					System.out.printf("The smallest number is %d%n",  smallest);
			
			
			}

		}

			
				
				
			