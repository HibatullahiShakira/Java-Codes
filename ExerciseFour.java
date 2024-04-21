import java.util.Scanner;

	public class ExerciseFour {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scanner.nextInt();

		int square = number * number;
		System.out.println("The square: " + square);

		if (number == 100 && square == 100) 
		System.out.printf("%d == %d%n", number + square );
			
		
		}
	}
        	
		



