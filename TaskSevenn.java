import java.util.Scanner;

	public class TaskSevenn {

		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int totalOfEven = 0;
		for(int i = 1; i <= 10; i++) {

		System.out.println("Enter scores: "); 
		int number = scanner.nextInt();

			if(number % 2 == 0) {
				 totalOfEven += number;
			}
		}

		int average = totalOfEven / 10;
	
		System.out.printf("The sum of even number is %d ", totalOfEven);
		System.out.printf("The average of even number is %d", average);
	}	
		
}