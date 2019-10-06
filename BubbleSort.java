import java.util.Arrays;

public class BubbleSort{

	public static void main(String... args){
		int[] array	= {9,8,7,6,5,4,3,2,1};
		bubble(array);
		int[] array1 ={9,18,27,36,45,54,63,72,81};
		bubble(array1);
	}

	static void bubble(int[] array){
		Arrays.stream(array).forEach(i -> System.out.print("  "+i));
		for(int i =0; i < array.length -1; i ++){
			boolean sw = false;
			for(int j= 0 ; j < array.length - i -1 ; j++){
				if(array[j] > array[j+1]){
					swap(array, j , j +1);
					sw = true;
				}
			}
			if(sw == false)
				break;
		}
		System.out.println("after sorting");
		Arrays.stream(array).forEach(i -> System.out.print("  "+i));
	}
	static void swap(int[] array, int i , int j){
		int o = array[i];
		array[i] = array[j];
		array[j] = o;
	}

}