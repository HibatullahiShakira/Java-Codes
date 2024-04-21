import java.util.Scanner;
import java.util.ArrayList;

	public class ArrayStoreB {

		public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> ages = new ArrayList<Integer>();

	for(int i = 0; i < 5; i++) {
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
			ages.add(age);
		}

	for(int counter = 0; counter < ages.size(); counter++) {
		System.out.print(ages.get(counter));
	}

		}
	}