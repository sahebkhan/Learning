import java.util.Arrays;
public class Test{
	public static void main(String... args){
		int[] arr = {4,3,2,1};
		int[][] tw ={{1,2},{3,4,5,6},{7}};
		System.out.println(arr);
		arr=new int[]{5,6,7};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(tw));
		System.out.println(Arrays.deepToString(tw));
		// System.out.println(Arrays.deepHashCode((double[])null));
	}

}

// 1 2 3 4 5 6 7 8 9 10
   