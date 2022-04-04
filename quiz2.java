import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();

		// Your code
        int cnt = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < M; i++ ){
            for (int j = 0; j < M; j++ ){
        
             sum1 += matrix1[rowidx][i] * matrix2[j][0]; 
            
               sum2 += matrix1[rowidx][i] * matrix2[j][1];
            
            

        }
        }
    System.out.print(sum1 + " " + sum2);
    
  scnr.close();  
}

}