public class Triangle {
	
	public static void main(String[] args) { 

	halfDiamond(6);
}

	public static void printstar() {
		System.out.print("* ");
	}

	public static void printspace() {
		System.out.println(" ");
	}

	public static void pintstar(int number) {
		for(int i = 1; i <= number; i++) {
			printstar();	
		}
	}

	public static void firstTriangle(int number) {
		for(int i = 1; i <= number; i++) {
		pintstar(i);
		printspace();
		}
	}

	
	public static void secondTriangle(int number) {
		for(int i = number; i >= 1; i--) {
		pintstar(i);
		printspace();
		}
	}

	public static void halfDiamond(int number) {
		firstTriangle(number);
		secondTriangle(number -1);
		}	

}