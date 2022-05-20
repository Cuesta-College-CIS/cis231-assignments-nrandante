package Quiz6;
import java.util.Arrays;
import java.util.Scanner;
public class Median {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array;
        int n = scnr.nextInt();

       array = createArray(n);
       printArray(array);
       System.out.println("The median number of the array is: " + getMedian(array , n));




















       
       scnr.close();
        
    }



    public static int[] createArray(int n) {
        int[] medianArray = new int[n];
    
        for (int i = 0; i < n; i ++) {
            medianArray[i] = (int)Math.floor(Math.random()*100); 
    
    
    
    
        }
        Arrays.sort(medianArray);
        return medianArray;
     
    
    
    
    }
 
 
 
 
    public static void printArray(int[] medArr) {
       
    
    
    
    for (int i = 0; i < medArr.length; i++) {
        System.out.println(medArr[i]);
    }




 }

 
public static int getMedian(int[] medArr, int n) {
    
    
     
    int evenDet;
    evenDet = n;
    
    int medianNum;
    medianNum = 0;
    while (evenDet >= 1) {
        evenDet = evenDet - 2;
        
        if (evenDet == 2) {

            medianNum = (medArr[n/2] + medArr[(n/2) + 1])/2;
            break;

        } 
        if (evenDet == 1) {

            medianNum = medArr[(n/2)];
            break;



        }

}
    
    return medianNum;
        




    }




}


