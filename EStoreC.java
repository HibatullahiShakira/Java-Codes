import java.util.Scanner;

	public class EStoreC {
		
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to E-store");
			System.out.println("Please Enter Name: ");
			String name = scanner.nextLine();

		System.out.println("Enter discount percentge: ");
		double discountPercentage = scanner.nextDouble();
		
	
			double costOfItem;
			double totalCost = 0;
			int counter = 1;

			for (counter = 1; counter <= 10; counter++) {

		        	System.out.println("Please Enter Cost of item : ");
		 	 	costOfItem = scanner.nextDouble();
		        	totalCost = totalCost + costOfItem;
                        	
                        }
				
			System.out.println("Customer Name:"+ name);
			System.out.printf("Original cost: %.2f%n", totalCost);

			double discount;
			double discountedCost; 
				
			if(totalCost >= 200) {
				 discount = (totalCost * discountPercentage) / 100;
				 discountedCost = totalCost - discount;
				 System.out.printf("The discounted cost is %.2f%n", discountedCost);
			}

			else if(totalCost <= 200) {
				System.out.println("The discounted cost: 0 (no discount added)");

			}

				System.out.println("Thanks for your patronage");
															
							
							}
						}
					
			 










