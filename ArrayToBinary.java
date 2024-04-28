public class ArrayToBinary {

	public static int[] BinaryArray(int[] digit) { 

	int[] figure = new int[digit.length];
	for(int i = 0; i < digit.length; i++) {
		 if (digit[i] % 2 == 0) figure[i] = 0;
		if (digit[i] % 2 != 0) figure[i] = 1; 
	}
		return figure;
	}

	public static void main(String[] args) {
	
	int[] array = {2,3,5,6,7};
	
	int[] output = ArrayToBinary.BinaryArray(array);

	System.out.print(output);
	
	}
}


		

	