import java.util.Scanner;
	
	public class FireDrillC {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[10];

		for(int i = 0; i < 10; i++) {
			
		System.out.println("Enter scores: ");
		scores [i] = scanner.nextInt();
		}

		for(int counter = 0; counter < 10; counter++) {
		System.out.print("\t" + scores[counter]);
		}
	}
}
