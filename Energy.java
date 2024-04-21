import java.util.Scanner;

   	public class Energy{

   	   public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);

	System.out.println("Enter amount of water in kilogram:");
  	 double amountOfWater = scanner.nextDouble();
   
	System.out.println("Enter initial temperature of water:");
   	double initialTemperature = scanner.nextDouble();

 	System.out.println("Enter number of final temperature of water:");
	double finalTemperature = scanner.nextDouble();

    	double energy = amountOfWater * (finalTemperature - initialTemperature) * 4148;
	System.out.printf("The energy needed to heat water is %.2f", energy);
     		}
}
  





