import java.util.Scanner;

	public class Counter {

		public static void main(String... args ) {
			Scanner scanner = new Scanner(System.in);

			
			System.out.println("Enter String: ");
			String str = Scanner.nextLine();
			

			for(int i = 0; i < str.length(); i++);
				{
				if(str.CharAt(i) != ' ')
					i++;
					}
				System.out.println ("Total number of characters in the string: " + i);
				}
			} 
