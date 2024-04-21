import java.util.Scanner;

	public class Statements{

		public static void main(String...args) {
 		String prompt = """
		Hi, welcome
		Press
		1 -> For English 
		2 -> For Yoruba 
		3 -> For Hausa
		""";
		System.out.println(prompt);
		Scanner keyboardInput = new Scanner(System.in);
		int userInput = keyboardInput.nextInt();

		switch(userInput) {
		case 1 -> System.out.println( "English" );
	
		case 2 -> System.out.println( "Yoruba" );

		case 3 -> System.out.println( "Hausa" );

 		default -> System.out.println( "get sense" );
		}
		{
		String prompt1 = """
		Hi, welcome
		Press
		1 -> For number
		2 -> For pin
		3 -> For password
		""";

		System.out.println(prompt1);

		Scanner keyboardInput1 = new Scanner(System.in);
		int userInput1 = keyboardInput1.nextInt();

		switch(userInput1) {
		case 1 -> System.out.println( "number" );
		
		case 2 -> System.out.println("pin");
	
		case 3 -> System.out.println( "password" );

 		default -> System.out.println( "get sense" );
		
		}
		

		}
	}
}