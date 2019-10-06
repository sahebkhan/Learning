import java.util.BitSet;
import java.util.Scanner;

public class Factor{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt(), two = sc.nextInt();
        int reminder = -1;
        long timer = System.currentTimeMillis();
        if(two > one){
            reminder = two >> (one -1);
        }else{
            reminder = one >> (two -1);
        }
        System.out.println("reminder "+reminder);

        System.out.println("time tooke "+ (System.currentTimeMillis() - timer));
    }
}