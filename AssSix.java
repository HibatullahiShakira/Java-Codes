import java.util.Scanner;
		
	public class AssSix {

		public static void main(String [] args ) {
		Scanner scanner = new Scanner(System.in);

			int positive = 1;
			int negative = 0;
			int count = 0;
						
			System.out.print("Enter the number");
			int number = scanner.nextInt();
	
			while (number != 0) {
			if (number < 0 ){
				negative++;
				}
			else if (number > 0) {
				positive++;
				}
			count++;

			System.out.print("Enter another number (enter 0 to exit)");
			number = scanner.nextInt();


			System.out.println(positive + "positive numbers");
			System.out.println(negative + "negative numbers");
			System.out.println("Total numbers entered: " + count);
					}

			}
		}

			
				
				
			