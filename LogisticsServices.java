import java.util.Scanner;

	public class LogisticsServices {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	System.out.println("WELCOME BACK TO SENDER LOGISTICS SERVICES");


	double collectionRate1 = 160;
	double collectionRate2 = 200;
	double collectionRate3 = 250;
	double collectionRate4 = 500;
	double base = 5000;
	double result;
	double result1;
	double result2;
	double result3;
	String anotherRider;
	String ridersName;

	
	do {

	System.out.println("Enter riders name: ");
	ridersName = scanner.nextLine();

	System.out.println("Enter the number of sucessful delivery");
	double sucessfulDelivery = scanner.nextDouble();

				scanner.nextLine();
	
		if(sucessfulDelivery <= 49) {
			 result = sucessfulDelivery * collectionRate1 + base;
				System.out.println(ridersName);
				System.out.printf("The wage for the day is %.2f\n", result);
		}

		else if (sucessfulDelivery <= 59) {
			result1 = sucessfulDelivery * collectionRate2 + base;
				System.out.println(ridersName);
				System.out.printf("The wage for the day is %.2f\n", result1);
		}

		else if (sucessfulDelivery <= 69) {
			result2 = sucessfulDelivery * collectionRate3 + base;
				System.out.println(ridersName);
				System.out.printf("The rider's wage for the day is %.2f\n", result2);
		}

		else if (sucessfulDelivery >= 70) {
			result3 = sucessfulDelivery * collectionRate4 + base;
				System.out.println(ridersName);
				System.out.printf("The rider's wage for the day is %.2f\n", result3);
		}

	System.out.println("Would you like to enter another riders name? (enter yes or no) ");
	anotherRider = scanner.nextLine().trim().toLowerCase();

	} while(anotherRider.equals("yes"));

				scanner.close();


	
	}
}
	