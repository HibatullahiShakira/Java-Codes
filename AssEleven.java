import java.util.Scanner;
	public class AssEleven {
	
		public static void main(String [] args) {
			Scanner scanner = new Scanner(System.in);
				
			double power;
			double base;
			double  result = 1;
				
			int count = 0;
		

			System.out.println("Enter base: ");
			 base = scanner.nextDouble();

			System.out.println("Enter power: ");
			power = scanner.nextDouble();

			for(count = 0; count <= base; count++) {

			
			result = base * power;

			System.out.printf("%.1f", result);

				}
			}
		}

			
