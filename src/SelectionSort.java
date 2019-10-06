import java.util.Arrays;

public class SelectionSort{

	public static void main(String... args){
		int[] arr =  {5,4,3,22,1};
		int minIndex=arr.length;
		boolean stable = false;
			for(int i=0; i < arr.length -1 ; i++){
			minIndex=i;
			for(int j= i ; j < arr.length;j++){
				if(arr[i]>arr[j])
					minIndex = j;
			}
			if(minIndex > i){
				if(stable){
					shift(arr, minIndex ,i);
				}
				else
					swap(arr,i,minIndex);
			}
		}
	
		Arrays.stream(arr).forEach(i -> System.out.print(i+"  "));
	}

	static void rsort(int[] arr,int start){
		int min =0,i=start;
		for(; i < arr.length -1 ; i ++){
			if(arr[i] > arr[i+1])
				min = i + 1;
		}
		if(i != min)
			swap(arr, i, min);
		if(start +1 < arr.length)
			rsort(arr, start + 1);	
	}

	static void swap(int[] arr, int i, int j){
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

	static void shift(int[]arr, int min, int j){
		int minE = arr[min];
		while(min > j){
			arr[min] = arr[min -1];
			min--;
		}
		arr[j]=minE;
	}
	
}