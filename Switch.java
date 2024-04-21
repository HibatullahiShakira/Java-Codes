import java.util.Scanner;

	public class Switch {

		public static void main(String...args) {
 		String prompt = """
		1 -> For English 
		2 -> For Yoruba 
		3 -> For Hausa
		""";
		System.out.println(prompt);
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

		switch(userInput) {
		case 1: System.out.println( "English" );
		break;
	
		case 2: System.out.println( "Yoruba" );
		break;

		case 3: System.out.println( "Hausa" );
		break;

 		default: System.out.println( "get sense" );
			}
		
		String prompt1 = """
		1 -> For number
		2 -> For pin
		3 -> For password
		""";

		System.out.println(prompt1);

		int userInput1 = scanner.nextInt();

		switch(userInput1) {
		case 1: System.out.println( "number" );
		break;
		
		case 2: System.out.println("pin");
		break;
	
		case 3: System.out.println( "password" );
		break;

 		default: System.out.println( "get sense" );
		
		}
		

		}
}