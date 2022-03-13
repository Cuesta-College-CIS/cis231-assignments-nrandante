import java.util.Scanner;

public class Lab516 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int arraySize = scnr.nextInt();
		float[] array1 = new float[arraySize];
		int i;
		// The below two for loops can be combined like below code
		/*
		 * for(i=0; i<array1.length;i++){
		 * array1[i] = scnr.nextFloat();
		 * }
		 * 
		 * float maxNum = array1[0];
		 * 
		 * for(i=0; i < array1.length; i++){
		 * if(array1[i] > maxNum){
		 * maxNum = array1[i];
		 * }
		 * }
		 */
		float maxNum = 0;
		for (i = 0; i < array1.length; i++) {
			array1[i] = scnr.nextFloat();
			if ((i == 0) || (array1[i] > maxNum)) {
				maxNum = array1[i];
			}
		}

		for (i = 0; i < array1.length; i++) {
			System.out.printf("%.2f", (array1[i] / maxNum));
			System.out.print(" ");
		}
		System.out.println();

	}
}
