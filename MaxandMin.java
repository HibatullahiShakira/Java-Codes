public class MaxandMin {

	public static int[] maximumandMinimum(int[] numbers) {

	int maximum = numbers[0];
	int minimum = numbers[0];

	for(int i = 0; i < numbers.length; i++) {

		if(numbers[i] > maximum) maximum = numbers[i];

		if(numbers[i] < minimum) minimum = numbers[i];
		
	}
	int[] result = new int[2];
	result[0] = maximum;
	result[1] = minimum;
		return result;
}
}