import java.util.Scanner;
	public class AssFive {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter price");
		int price = scanner.nextInt();
		
		int c = 50;
		int h = 30; 
		int calculate = (2 * c * price)/ h;
		double output = Math.sqrt(calculate);
		System.out.println("output: " + output);
			}
		}