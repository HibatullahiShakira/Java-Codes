import java.util.Scanner;
import java.util.ArrayList

	public class ArrayStoreE {

		public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> names = new ArrayList<String>();
		
		ArrayList<Integer> grades = new ArrayList<Integer>();

	for(int i = 0; i < 5; i++) {

		System.out.println("Enter name: ");
		String name = scanner.nextLine();
			names.add(name);
	
		System.out.println("Enter grade: ");
		int grade = scanner.nextInt();
			grades.add(grade);
			scanner.nextLine();
		}

	for(int counter = 0; counter < names.length; counter++) {
		System.out.println("Student name is: ", names.get(counter), "\tStudent age is: \t " ages.get(counter));
	}

		scanner.close();

		}
	}