import java.util.Arrays;
public class EvenOddBinary {

	public static boolean[] BinaryArray(int[] digit) { 

	int[] figure = new int[digit.length];
	for(int i = 0; i < digit.length; i++) {
		 if (digit[i] % 2 == 0) figure[i] = 0;
		if (digit[i] % 2 != 0) figure[i] = 1; 
	}
		return figure;
	}

	public static boolean[] booleanArray(int[] number) { 

	boolean[] digit = new boolean[number.length];
	for(int i = 0; i < number.length; i++) {
		 if (number[i] % 2 == 0) digit[i] = false;
		if (number[i] % 2 != 0) digit[i] = true; 
	}
		return digit;
	}

	public static void main(String[] args) {
	
	int[] array = {2,3,5,6,7};
	
	boolean[] output = EvenOddBinary.booleanArray(array);

	System.out.print(Arrays.toString(output));
	
	}
}


		

	