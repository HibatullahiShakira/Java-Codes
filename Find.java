public class Find {

	public static void main(String[] args) {

	int[] numbers = {4, 6, 67, 8, 45, 10, 59};
	
	int maximum = numbers[0];
	int minimum = numbers[0];

	for(int i = 0; i < numbers.length; i++) {

		if(numbers[i] > maximum) maximum = numbers[i];

		if(numbers[i] < minimum) minimum = numbers[i];
		
	}

System.out.print("The maximum number is" + maximum + "\nThe minimum number is" + minimum);
}
}