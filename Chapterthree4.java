import java.util.Scanner;

	public class Chapterthree4 { 
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int product = 1;
		int[] numbers = new int [4];
		int minimum = numbers[0];
		int maximum = numbers[0];
		int i;
	for(i = 0; i < 4; i++) {
		System.out.println("Enter number: ");
		numbers[i] = scanner.nextInt();
			sum += numbers[i];
			product *= numbers[i];
		if (numbers[i] > maximum) maximum = numbers[i];
		if (numbers[i] < minimum) minimum = numbers[i];
	}
		double average = sum / 4;

System.out.printf("\nThe product of the numbers is: %d", product); 
System.out.printf("\nThe sum of the numbers are: %d", sum); 
System.out.printf("\nThe average of the numbers is: %.2f", average);
System.out.printf("\nThe maximun of the numbers is: %d", maximum); 
System.out.printf("\nThe minimum of the numbers is: %d", minimum);
		}
	}