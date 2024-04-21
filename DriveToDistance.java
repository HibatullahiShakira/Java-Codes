import java.util.Scanner;

   	public class DriveToDistance{

   	   public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);

	System.out.println("Enter driving distance:");
  	 double drivingDistance = scanner.nextDouble();
   
	System.out.println("Enter miles per gallon:");
   	double milesPerGallon = scanner.nextDouble();

 	System.out.println("Enter price per gallon:");
	double pricePerGallon = scanner.nextDouble();
	
    	double costOfDriving = (pricePerGallon / milesPerGallon) * drivingDistance;
	System.out.printf("The cost of driving %.2f", costOfDriving );
          }
}
