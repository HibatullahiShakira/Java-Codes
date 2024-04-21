import java.util.Scanner;

   	public class ExchangeRate{
   	public static void main(String[] args){
  	Scanner scanner = new Scanner(System.in);

   	System.out.println("Enter exchange rate from dollars to RM:");
  	 double exchangeRateFromDollarToRM = scanner.nextDouble();

  	 System.out.println("Enter amount to Convert dollars to RMB and 1 vice versa:");
  	 double amountToConvertDollarsToRMBAnd1VicesVersa = scanner.nextDouble();
		
	System.out.println("Enter the dollars amount:");
	double dollarAmount = scanner.nextDouble();

	

	System.out.println("Enter exchange rate from dollars to RMB:");
	double exchangeRateFromDollarToRMB = scanner.nextDouble();

	System.out.println("Enter amount to convert  to RMB and 1 vice versa:");
	double amountToConvertDollarsToRMBAnd1ViceVersa = scanner.nextDouble();

	System.out.println("Enter the RMB amount:");
	double RMBAmount = scanner.nextDouble();
	
	 exchangeRateFromDollarToRMB = 1 / exchangeRateFromDollarToRMB;
	 exchangeRateFromRMBToDollar = 1 / exchangeRateFromRMBToDollar;
	
	System.out.printf("The exchange Rate From Dollar To RMB %.2f", exchangeRateFromRMBToDollar);
   }
}
	

	
	