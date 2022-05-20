package Quiz6;

import java.util.Scanner;
public class GreatestSum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();

        int[] array;
        array = createArray(n);

        printArray(array);

        System.out.println("The three greatest consecutive numbers in the array are: " +  greatestSumString(array));






        scnr.close();
    }


    public static void printArray(int[] n) {



        for (int i = 0; i < n.length; i++ ){
                System.out.println(n[i]);



        }
    }

public static int[] createArray(int n) {
        int[] array = new int[n];
    
        for (int i = 0; i < n; i ++) {
            array[i] = (int)Math.floor(Math.random()*100); 
    
    
    
    
        }
        
        return array;
     
    
    
    
    }

 public static String greatestSumString(int[] n){
    int maxSum;
    int index;
    int tempSum;
   tempSum = 0;
   maxSum = 0;
    index = 0;
   for (int i = 0; i < n.length - 2; i++) {
       tempSum = n[i] + n[i+1] + n[i+2];

       if (maxSum < tempSum){
            maxSum = tempSum;
            index = i;


       }
}

return (n[index]) + " " + (n[index + 1]) + " " + (n[index + 2]);

 

}




}