import java.util.Scanner;
import java.util.ArrayList;

	public class ArrayStoreA {

		public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<String>();

	for(int i = 0; i < 5; i++) {
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
			names.add(name);
		}

	for(int counter = 0; counter < names.size(); counter++) {
		System.out.print(names.get(counter));
	}

		}
	}