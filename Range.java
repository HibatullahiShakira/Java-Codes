public class Range { 
	public static int rangeValue(int... numbers) {
	
	int max_value = numbers[0]
	int min_value = numbers[0]
	for(int number : numbers) {
		if (number < min_value) {
			min_value = number;}
		if (number > max_value) {
			max_value = number;}
	return max_value - min_value




System.out.print(range_value(7,4,2,3,4))
