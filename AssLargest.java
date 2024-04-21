import java.util.Scanner;
		
	public class AssLargest {


		public static void main(String [] args ) {
		Scanner scanner = new Scanner(System.in);
		
			
			System.out.println("How many times would you like to enter number: ");
			int enter = scanner.nextInt();
			
			int counter = 1;

			for(counter = 1; counter <= enter; counter++) {

				System.out.println("Enter the number");
				int numb = scanner.nextInt();

				int largest = 0;
				int smallest = 2000000;
			
				if(smallest <= numb) {
					numb = smallest; 
						}
				if(largest > numb) {
					numb = largest;
					System.out.print(numb);
								
							    }
	
							}
							
						}

					}

			
				
				
			