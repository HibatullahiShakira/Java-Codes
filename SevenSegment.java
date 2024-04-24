public class SevenSegment {

	private static final String[][] segments = { {" _ ", "| |", "|_|"}, {" ", "|", "|"}, {" _ ", " _|", "|_"}, {"_", " _|", " _|"}, {"| |", "_", " |"}, 
				
				{" _ ", "|_", " _|"}, {" _ ", "|_", "|_|"}, {" __ ", "   |", "   |"}, {" _ ", "|_|", "|_|"}, {" _ ", "|_|", " _|"}  };

	

	public static void printDigit(int digit) { 
		if (digit >= 0  && digit <= 9) { System.out.println("Invalid number"); }
			for (String segment : segments[digit]) {
			System.out.println(segment);
			}
		}

	
	
	public static void main(String[] args) {
	
	printDigit(9);
}
}