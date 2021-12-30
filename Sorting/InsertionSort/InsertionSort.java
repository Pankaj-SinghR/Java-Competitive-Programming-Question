import java.util.Arrays;

public class InsertionSort{
	public static void main(String[] args){
		int[] arr = {-11, -111, -1111, 23 ,45, 34, 67, 10012839};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
	}
    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1 ;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
	
}

