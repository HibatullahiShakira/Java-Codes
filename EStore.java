import java.util.Scanner;

	public class EStore {
		
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to E-store");
			System.out.println("Please Enter Name: ");
			String name = scanner.nextLine();
	
			double costOfItem;
			double totalCost = 0;
			int counter = 1;
			while (counter <= 10) {

		        	System.out.println("Please Enter Cost of item : ");
		 	 	costOfItem = scanner.nextDouble();
		        	totalCost = totalCost + costOfItem;
                        	counter++;
                        }
				
			System.out.println("Customer Name:"+ name);
			System.out.printf("Original cost: %.2f%n", totalCost);

			double discount;
			double discountedCost; 
				
			if(totalCost >= 200) {
				 discount = (totalCost * 10) / 100;
				 discountedCost = totalCost - discount;
				 System.out.printf("The discounted cost is %.2f%n", discountedCost);
			}

			else if(totalCost <= 200) {
				System.out.println("The discounted cost: 0 (no discount added)");

			}

				System.out.println("Thanks for your patronage");
															
							
							}
						}
					
			 










