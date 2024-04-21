import java.util.Scanner;
	public class Chapterthree1 {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your problem  ");
		String problem = scanner.nextLine();

		System.out.println("What is your problem again: (Enter yes or no)");
		String problemAgain = scanner.nextLine();

			if (problemAgain.equals("no")) 
			System.out.println("Well you have it again");
			
			if (problemAgain.equals("yes"))
			System.out.println("Well you have it now");
		}
	}
		