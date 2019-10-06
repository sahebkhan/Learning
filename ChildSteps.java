
public class ChildSteps{

    public static void main(String[] args){
       steps(2);
       System.out.println(pways);
    }
    private static int pways=0;

    static void steps(int n){
        if(n == 0)
            pways++;
        if(n < 0)
            return;
        steps(n-1);
        steps(n-2);
        steps(n-3);
        steps(n-4);
        steps(n-5);
    }
}