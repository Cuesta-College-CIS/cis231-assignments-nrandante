import java.util.Random;

public class AscendingOrder {
    public static void main(String[] args) {
    
    Random rand = new Random();

    int maxValue = 101; 
        int y;
        int x;
        int z;

        x = rand.nextInt(maxValue);
        y = rand.nextInt(maxValue);
        z = rand.nextInt(maxValue);



    
    
    if (x < y && x < z && y < z){
        System.out.print(x + " " + y + " " + z);
    } 
    else if (x < y && x < z && y > z){
        System.out.print(x + " " + z + " " + y);
    }
    else if (x > y && y < z && x < z){
        System.out.print(y + " " + x + " " + z );
    }
    else if (x > y && y < z && x > z){
        System.out.print(y + " " + z + " " + x);
    }
    else if (x > y && y > z && z < x){
        System.out.print(z + " " + y + " " + x);
    }
    else if (x < y && y > z && x > z){
        System.out.print(z + " " + x + " " + y);
    }















    }
}
