import java.util.Scanner;

   	public class Interest{
   		public static void main(String[] args){
  		Scanner scanner = new Scanner(System.in);
   	
	System.out.println("Enter balance:");
	int balance = scanner.nextInt();

	System.out.println("Enter annualInterestRate:");
	double annualInterestRate = scanner.nextDouble();

	double interest = balance * ( annualInterestRate / 1200 );

        

	System.out.printf("interest is %.2f%n", interest);
	}
}

	
