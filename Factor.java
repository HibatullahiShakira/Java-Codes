import java.util.Scanner;
	
	public class Factor {

	public static void main(String...args){
		Scanner scanner = new Scanner(System.in);

		while(true) {		

		System.out.println("Enter number: ");
		int number = scanner.nextInt();

		int factor = 0;
		int counter = 1
		while(counter <= number) {		
		
		

		if ( number % factor == 0) {
			System.out.println("The factors of the number entered are " factor = factor +1);
			
				}
			
			counter++;
		}
			}
		}

	}