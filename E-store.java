import java.util.Scanner;

	public class EStore {
		
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Name: ");
		String name = new scanner.nextLine();

		System.out.println("Please Enter Cost of item 1: ");
		float item1 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 2: ");
		float item2 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 3: ");
		float item3 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 4: ");
		float item4 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 5: ");
		float item5 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 6: ");
		float item6 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 7: ");
		float item7 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 8: ");
		float item8 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 9: ");
		float item9 = new Scanner.nextInt();

		System.out.println("Please Enter Cost of item 10: ");
		float item10 = new Scanner.nextInt();

		
			float totalCost = item1 + item2 + item3 + item4 + item5 + item6 + item7 + item8 + item9 + item10;

					int counter = 0;	
				while(totalCost >= 200) {

			float discount = (totalCost * 10) / 100;

			float discountedCost = totalCost - discount;
				
				System.out.printf("The discounted cost is: ", discountedCost);
							}
					counter++;

							}
						}
					
			 










