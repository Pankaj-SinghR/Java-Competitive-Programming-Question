import java.util.Arrays;

public class Selectionsort{
  public static void main(String[] args){
    int[] arr = {-90, 89, -34 , 22, -45, 1199, -111};
    
    System.out.println(Arrays.toString(arr));//before sorting
    System.out.println();
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));//after sorting
  }
  static void selectionSort(int[] arr){
    for(int i=0; i<arr.length; i++){
      int last = arr.length - i - 1;
      int max = findmax(arr , 0 , last);
      swap(arr, max, last);
    }    

  }

  static int findmax(int[] arr, int start , int end){
    int max = 0;
    for(int i=0; i<=end; i++){
          if(arr[max] < arr[i]){
            max = i;
          }
    }
    return max;
  }

  static void swap(int[] arr, int first, int second){
     int temp = arr[first];
     arr[first] = arr[second];
     arr[second] = temp;
  }


}
