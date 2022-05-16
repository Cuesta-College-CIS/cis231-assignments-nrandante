
import java.util.Scanner;
import java.lang.Math;
public class Quiz2 {
    public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
    
        
        
      int[] array1, array2;
      
      array1 = constructArray(scnr);
      array2 = constructArray(scnr);
        
      printArray(array1);
      printArray(array2);
      
      int result = findMoreEvens(array1, array2);
      if(result != 0){
      System.out.println("The array " + result + " has more even numbers!");
      } else {
          System.out.println("Both arrays have the same amount of even numbers");
      }
      
       
     
     
     
     
     
     
     
     
      result = findGreatest(array1, array2);
       
       
      
      
      
      
      
      if (result == 1) {
          System.out.println("The array " + result + " has the greatest value of " + array1[(array1.length - 1)]);
          
          
      } else{
          System.out.println("The array " + result + " has the greatest value " + array2[(array2.length - 1)]);
          
          
          
      } 
          
          
      
        
        
    }
   
    
        
        
    
        
        
        
    

    
    
    
    public static int [] constructArray(Scanner scnr) {
        int N = scnr.nextInt();
        
        int[] convArr = new int[N];
        
       
        
        
        for (int i = 0; i < N; i++) {
            
            convArr[i] = (int)(Math.random() * 100);
            
            }
            
            
        
        
        
        return convArr;
        
        
        
        
        
    }
    
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\n");
            
            
            
        }
        
    }
    
    
    public static int findMoreEvens(int[] n1, int[] n2) {
        int evenCount1;
        int evenCount2;
        evenCount1 = 0;
        evenCount2 = 0;
        
        for(int i = 0; i < n1.length; i++){
            while(true){
                
                if(n1[i] == 0){
                    continue;
                    
                    
                }
                
                n1[i] = (n1[i] - 2); 
                
                
                if(n1[i] == 2){
                    evenCount1++;
                    break;
                    
                    
                }
                if (n1[i] == 1){
                    break;
                    
                }
                
            }
            
        }
        
        
        
        for(int i = 0; i < n2.length; i++){
            while(true){
                
                if(n2[i] == 0){
                    continue;
                    
                    
                }
                n2[i] = (n2[i] - 2); 
                
                if(n2[i] == 2){
                    evenCount2++;
                    break;
                    
                    
                }
                if (n2[i] == 1){
                    break;
                    
                }
                
            }
            
        }
        
        
    if(evenCount1 > evenCount2){
        return 1;
        
    } else if (evenCount2 > evenCount1){
        return 2;
    } else {
        
        
        return 0; // if the arrays have the same amount of even numbers it will return the 0th array.
    }
    
    
        
}



        public static int findGreatest(int[] n1, int[] n2) {
            
            
            
            int maxValue1;
            
            
            int maxValue2;
           int index1 = 0; 
            
            
            maxValue1 = 0;
            
            int cnt1 = 0;
            
            for(int i = 0; i < n1.length; i++) {
                 if(cnt1 == 0){
                      maxValue1 = n1[i];
                     }
                     cnt1++;
                     
                 
                 if(n1[i] > maxValue1) {
                     maxValue1 = n1[i];
                     index1 = i;
                     }
                    
                 }
                 
                 
                 int cnt2;
                 cnt2 = 0;
                 
                 
                 maxValue2 = 0;
                 
                 
                 int index2 = 0;
                 for(int i = 0; i < n2.length; i++) {
                    if(cnt2 == 0){
                      maxValue2 = n2[i];
                     }
                     cnt2++;
                     
                 
                 if(n2[i] > maxValue2) {
                     maxValue2 = n2[i];
                      index2 = i;
                     }
                    
                 }
                 
                      
                
                n1[(n1.length - 1)] =  n1[index1];
                n2[(n2.length - 1)] =  n2[index2];
                     
                
         if(maxValue1 > maxValue2) {
                    return 1;
                    }
                    else {
                        return 2;
                        
                        
                        
                        
                    } 
                        
                        
                    
                    
                    
                
                
            }
    
    
    
    
    
        }
