import java.util.Scanner;
	public class GasMileage {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter miles driven");
		double milesDriven = scanner.nextInt();
		
		System.out.println("Enter gallon used");
		double gallonUsed = scanner.nextInt();
		
		double milesPerGallon = milesDriven / gallonUsed;
		 
		System.out.println("miles Per Gallon\n "+ milesPerGallon);
			}
		}