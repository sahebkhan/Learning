
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GCF{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            System.out.println("eacho "+ scanner.nextInt());
        }
        System.out.println("Stream sum"+ IntStream.of(4,5,6,7).sum());
        int [] a = {9,7,4,5};
        System.out.println("Arrays stream sumes"+ Arrays.stream(a).sum());
        Object [] o ={9,8,7,5,4};
       System.out.println(" unknown type sum "+ Arrays.stream(o).map(Object::toString).collect(Collectors.summarizingInt(Integer::valueOf)));
        System.out.println("out side of loop");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(" first "+first+"  second"+second);
    }
}