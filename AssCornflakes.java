import java.util.Scanner;
	public class AssCornflakes {
	
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
				
			System.out.println("Enter price: ");
			double price = scanner.nextDouble();

			System.out.println("Enter discount percentage: ");
			double discountPercentage = scanner.nextDouble();

			double discountValue = (discountPercentage / 100.0) * price;
			double finalPrice = price - discountValue;
		
			System.out.printf("%2.f ", finalPrice);
		
				}
			}