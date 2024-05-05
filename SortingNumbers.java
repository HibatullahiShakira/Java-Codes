public class SortingNumbers {
	public static int[] ascendingNumbers(int[] inputs) {

	int[] input = [inputs.length];
	for(int index = 0; index < inputs.length; index++) {
		for(int count = index + 1; count < inputs.length; count++) {
		if(input[index] > input[count]) {		
		input[index] = input[index] + input[count];
		input[count] = input[index] - input[count];
		input[index] = input[index] - input[count];
	}
		}
	return input[index] + " "
	}


public static void main(String[] args) {

	
 System.out.print(ascendingNumbers[index] + " ");}
}




	