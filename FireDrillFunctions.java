public class FireDrillFunctions {

	public static int[] taskOne(int[] number) {
	int[] numbers = new int[number.length / 2];
	int j = 0;
	for(int i = 0; i < 10; i = i + 2) {
		numbers[j] = number[i];
		j++;
	}
	return numbers;
	}


	public static int[] taskTwo(int[] number) {
	int[] numbers = new int[number.length / 2];
	int j = 0;
	for(int i = 1; i < 10; i = i + 2) {
		numbers[j] = number[i];
		j++;
		}	
	return numbers;
	}

	public static int taskThree(int[] number) {
	int total = 0; 
	int[] numbers = new int[number.length];
	for(int i = 1; i < 10; i = i + 2) {
		total += number[i];

		}	
	return total;
	}

	public static int taskFour(int[] number) {
	int total = 0;
	int[] numbers = new int[number.length];
	for(int i = 0; i < number.length; i = i + 2 ) {
		total += numbers[i];
	}
	return total;
	}	

	public static int taskFive(int[] numbers) {
	int minimum = numbers[1];
	for(int i = 1; i < 10; i = i + 2) {
		if(numbers[i] < minimum) minimum = numbers[i];
	}
	return minimum;
}

	public static int taskSix(int[] numbers) {
	int maximum = 0;
	int i;
	for(i = 0; i < 10; i = i + 2) {
		if(numbers[i] > maximum) 
			maximum = numbers[i];
	}

		return maximum;
		
}



}