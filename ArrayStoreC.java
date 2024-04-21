import java.util.Scanner;

	public class ArrayStoreC {

		public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int[] ages = new int[5];

	for(int i = 0; i < 5; i++) {
		System.out.println("Enter age: ");
		ages [i] = scanner.nextInt();
		}

	for(int counter = 0; counter < ages.length; counter++) {
		System.out.println(ages[counter]);
	}

		}
	}