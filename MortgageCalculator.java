import java.util.Scanner;
	
	public class MortgageCalculator {

	public static void main(String...args){
		Scanner scanner = new Scanner(System.in);	

		System.out.println("Enter principal amount: ");
		Double principalAmount = scanner.nextDouble();

		System.out.println("Enter annual interest rate: ");
		Double annualInterestRate = scanner.nextDouble();

		System.out.println("Enter duration: ");
		double duration = scanner.nextDouble();

		double percentageToDecimal = annualInterestRate / 100 / 12;
		double durationToMonth = duration * 12;
		double calculate = percentageToDecimal * (1 + percentageToDecimal); 
		double result = Math.pow(calculate, durationToMonth);
		double calculatee = 1 + percentageToDecimal;
		double resultt = Math.pow(calculatee, durationToMonth);
		double resulttt = resultt - 1;
		double calculate1 = principalAmount * result;
 		double monthlyPayment = calculate1 / resultt;

		System.out.printf("%.2f", monthlyPayment);

			}
		}
		
		

