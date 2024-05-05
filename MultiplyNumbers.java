public class MultiplyNumbers {
	
	public static int arrayMultiplyNumbers(int[] input) {
	int[] inputs = new int [input.length];
	int maximum = 0;
	int ans = 0;
	for(int i = 0; i < input.length; i++) {
		for(int j = 0;  j < input.length; j++) {
		if(input[i] != input[j]) {
		ans = input[i] * input[j];
		//System.out.printf("%d X %d = %d\n", input[i], input[j], ans);
		
		if(ans > maximum) maximum = ans;               
		}
		}
	}
	return maximum;
	}


public static void main(String[] args){ 

	int[] number = {6,6,1,2,3};
	System.out.print(arrayMultiplyNumbers(number));
}
}
		
		