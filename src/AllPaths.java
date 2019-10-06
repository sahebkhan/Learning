import java.util.Arrays;

public class AllPaths{

    static  int array[][]={{0,0,-1,0,0},{0,0,0,0,-1},{0,0,0,0,0},{-1,0,0,0,0},{0,0,-1,0,-2}};
    static int count[][]= new int[5][5];
    public static void main(String[] args){
        
        Arrays.stream(count).forEach(each -> Arrays.fill(each, -1));
       System.out.println(paths(0,0));
        Arrays.stream(array).forEach( each -> System.out.println(Arrays.toString(each)));
        // Arrays.stream(count).forEach( each -> System.out.println(Arrays.toString(each)));
    }

    public static int paths(int x,int y){

        if(invalid(x,y))
            return 0;
        if(array[x][y] ==-2)
            return 1;
        if(array[x][y] > 0 )
        return array[x][y];
        return  array[x][y] = paths(x+1,y)+paths(x,y+1);
    }
    public static boolean invalid(int x, int y){
        return x > array.length-1  || y > array.length-1 ||array[x][y] == -1;
    }


}