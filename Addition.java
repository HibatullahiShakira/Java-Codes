import java.util.Scanner;
import java.util.ArrayList;

public class Addition {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	ArrayList<Integer> numbers = new ArrayList<Integer>(); 
	ArrayList<Integer> output = new ArrayList<Integer>();

	int sum = 0;
	int number;
		for(int i = 0; i < 5; i++) {
	System.out.println("Enter numbers ");
	number = scanner.nextInt();
		numbers.add(number);
			sum += number;
	
		}

	for(int counter = 0; counter < 5; counter++) {
		output = sum - number;
		System.out.print(output.get(counter));

	//items.get(i)
}
}
}