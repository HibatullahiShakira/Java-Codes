import java.util.Scanner;

	public class ArrayStore {

		public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[5];

	for(int i = 0; i < 5; i++) {
	System.out.println("Enter name: ");
	names [i] = scanner.nextLine();
		
	}

	for(int counter = 0; counter < names.length; counter++) {
		System.out.println("\n" + names[counter]);
	}

		}
	}