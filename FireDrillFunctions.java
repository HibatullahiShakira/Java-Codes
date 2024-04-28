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

	public static int taskFive(int[] number) {
	int minimum = number[0];
	for(int i = 1; i < 10; i = i + 2) {
		if(number[i] < minimum) minimum = number[i];
	}
	return minimum;
}

	public static int taskSix(int[] number) {
	int maximum = number[0];
	int i;
	for(i = 0; i < 10; i = + 2) {
		if(number[i] > maximum) maximum = number[i];
		}
		return maximum;
		
}



}