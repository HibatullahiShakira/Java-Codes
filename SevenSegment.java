import java.util.Scanner;
public class SevenSegment {

	private static final String[][] segments = { {" _ ", "| |", "|_|"}, {" ", "|", "|"}, {" _ ", " _|", "|_"}, {"_", " _|", " _|"}, {"| |", "_", " |"}, 
				
				{" _ ", "|_", " _|"}, {" _ ", "|_", "|_|"}, {" __ ", "   |", "   |"}, {" _ ", "|_|", "|_|"}, {" _ ", "|_|", " _|"}  };

	

	public static int printDigit(int digit) { 
		if (digit >= 0  && digit <= 9) { System.out.println("Invalid number"); }
			for (String segment : segments[digit]) {
			return segment;
			}
		}

	
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Number: ");
	String figure = scanner.nextLine();

	String digit = printDigit(number);

	System.out.print(digit);

}
}