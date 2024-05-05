public class MaxandMin {

	public static int maximum(int[] number) {
	int maximum = number[0];

	for (int i = 0; i < number.length; i++) {
		if(number[i] > maximum) 
			maximum = number[i];
		}
	return maximum;
}
}


	public static int min(int[] numbers) {
	int minimum = number[0];
	
	for(int i = 0; i < numbers.length; i++) {
		if(numbers[i] < minimum) {
		minimun = numbers[i];
		}
	}
	return minimum;
	}