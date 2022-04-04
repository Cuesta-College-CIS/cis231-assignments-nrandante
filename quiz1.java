import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval, tmp;
			
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();

		for (int i = 0; i < N; i++){
			for (int j = 1; j < N; j++){
				int minidx = 0;

				minidx++;
				if(numbers[i] < numbers[j]){
					minval = numbers[i];
					numbers[minidx] = numbers[0];
					 numbers[0] = minval;
					
				
				}
				System.out.println(numbers[i]);
			}
		}
			 for (int i = 1; i < N; i++){
				for (int j = 2; j < N; j++){
						int minidx = 0;
						minidx++;
					
					if( numbers[i] < numbers[j]){
						minval = numbers[i];
						numbers[minidx] = numbers[1];
						 numbers[1] = minval;

						}
						System.out.println(numbers[i]);



				}
			}


								for (int i = 2; i < N; i++){
									for (int j = 3; j < N; j++){
											int minidx = 0;
											minidx++;
										
										if( numbers[i] < numbers[j]){
											minval = numbers[i];
											numbers[minidx] = numbers[2];
											numbers[2] = minval;
					
											}
											System.out.println(numbers[i]);


										}

							}

						for (int i = 3; i < N; i++){
						for (int j = 4; j < N; j++){
									int minidx = 0;
									minidx++;
								
								if( numbers[i] < numbers[j]){
									minval = numbers[i];
									numbers[minidx] = numbers[3];
									numbers[3] = minval;

									}
									System.out.println(numbers[i]);


					}

		 }
		
		 





								for (int i = 4; i < N; i++){
									for (int j = 5; j < N; j++){
											int minidx = 0;
											minidx++;
										
										if( numbers[i] < numbers[j]){
											minval = numbers[i];
											numbers[minidx] = numbers[4];
											numbers[4] = minval;

											}
											System.out.println(numbers[i]);


				}

	 }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

		
			
		scnr.close();
	}
	
		

}
