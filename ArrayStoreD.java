import java.util.Scanner;

	public class ArrayStoreD {

		public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[5];
		int[] grades = new int[5];

	for(int i = 0; i < 5; i++) {

		System.out.println("Enter name: ");
		names [i] = scanner.nextLine();
	
		System.out.println("Enter grade: ");
		grades [i] = scanner.nextInt();
			scanner.nextLine();

		}

	for(int counter = 0; counter < names.length; counter++) {
		System.out.println("Student name: " + grades[counter] + "\tStudent grade"+ names[counter]);
	}


		}
	}