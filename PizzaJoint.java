import java.util.Scanner;

	public class PizzaJoint {
	
	public static void main(String[] ags) {
	Scanner scanner = new Scanner(System.in);

	int[]  sapaSize = {4, 2000};
	int[] smallMoney = {6, 2400};
	int[] bigBoys = {8, 3000};
	int[] odogwu = {12, 4200};

	System.out.print("Enter number of people: ");
	int numberOfPeople = scanner.nextInt();

	scanner.nextLine();

	System.out.print("Enter type of pizza box: ");
	String pizzaBoxType = scanner.nextLine();


	if(pizzaBoxType.toLowerCase().equals("sapa size")) {
		int boxSize = numberOfPeople / sapaSize[0];
		int remainder = numberOfPeople % sapaSize[0];
		if (remainder > 0){
		int servedSize =  boxSize + 1;
		int totalNumberOfSlices = servedSize * sapaSize[0];
		int remainingSlices = totalNumberOfSlices - numberOfPeople;
		int amountPaid = servedSize * sapaSize[1];
		System.out.println("Number of boxes of pizza to buy = " + servedSize + ("explanation: Sapa Size contains 8 slices per box," + servedSize + " boxes should be sufficient for " + numberOfPeople + " persons as it would contain " + totalNumberOfSlices + " in all "));   
		System.out.println("price = " + amountPaid + ("expalnation: " + sapaSize[1] + " per box for " + servedSize + " boxes" ));
		}
		else {
		int amountPaid = boxSize * sapaSize[1];
		System.out.print(amountPaid);
		}
		}
		

		
	if(pizzaBoxType.toLowerCase().equals("smallMoney")) {
		int boxSize = numberOfPeople / smallMoney[0];
		int remainder = numberOfPeople % smallMoney[0];
		if (remainder > 0){
		int servedSize =  boxSize + 1;
		int totalNumberOfSlices = servedSize * smallMoney[0];
		int remainingSlices = totalNumberOfSlices - numberOfPeople;
		int numberOfBoxesBought = servedSize * smallMoney[1];
		System.out.println("Number of boxes of pizza to buy = " + servedSize + ("explanation: small money contains 8 slices per box," + servedSize + " boxes should be sufficient for " + numberOfPeople + " persons as it would contain " + totalNumberOfSlices + " in all "));   
		System.out.println("price = " + numberOfBoxesBought  + ("expalnation: " + smallMoney[1] + " per box for " + servedSize + " boxes" ));
		System.out.print(numberOfBoxesBought);   
		}
		else {
		int amountPaid = boxSize * smallMoney[1]; 
		System.out.print(amountPaid);
		}
		}


	if(pizzaBoxType.toLowerCase().equals("big Boys")) {
		int boxSize = numberOfPeople / bigBoys[0];
		int remainder = numberOfPeople % bigBoys[0];
		if (remainder > 0){
		int servedSize =  boxSize + 1;
		int totalNumberOfSlices = servedSize * bigBoys[0];
		int remainingSlices = totalNumberOfSlices - numberOfPeople;
		int numberOfBoxesBought = servedSize * bigBoys[1]; 
		System.out.println("Number of boxes of pizza to buy = " + servedSize + ("explanation: big boys contains 6 slices per box," + servedSize + " boxes should be sufficient for " + numberOfPeople + " persons as it would contain " + totalNumberOfSlices + " in all "));   
		System.out.println("price = " + numberOfBoxesBought  + ("expalnation: " + bigBoys[1] + " per box for " + servedSize + " boxes" ));
		System.out.print(numberOfBoxesBought);  
		}
		else { 
		int amountPaid = boxSize * bigBoys[1]; 
		System.out.print(amountPaid);
		}
		}


	if(pizzaBoxType.toLowerCase().equals("odogwu")) {
		int boxSize = numberOfPeople / odogwu[0];
		int remainder = numberOfPeople % odogwu[0];
		if (remainder > 0){
		int servedSize =  boxSize + 1;
		int totalNumberOfSlices = servedSize * odogwu[0];
		int remainingSlices = totalNumberOfSlices - numberOfPeople;
		int numberOfBoxesBought = servedSize * odogwu[1];
		System.out.println("Number of boxes of pizza to buy = " + servedSize + ("explanation: odogwu contains 6 slices per box," + servedSize + " boxes should be sufficient for " + numberOfPeople + " persons as it would contain " + totalNumberOfSlices + " in all "));   
		System.out.println("price = " + numberOfBoxesBought  + ("expalnation: " + odogwu[1] + " per box for " + servedSize + " boxes" ));
		System.out.print(numberOfBoxesBought ); 
		}
		else { 
		int amountPaid = boxSize * odogwu[1]; 
		System.out.print(amountPaid);
		}
		}
			scanner.close();

}
}







		