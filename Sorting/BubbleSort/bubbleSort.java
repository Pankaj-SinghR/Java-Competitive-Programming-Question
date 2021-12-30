import java.util.Arrays;

public class bubbleSort{
  public static void main(String[] args){
      
    int[] arr = {5, 4, 3, 2, 1}; //This is worst case ,cuz array is sorted in reverse order
      
    System.out.println(Arrays.toString(arr)); //before sorting
    bubblesort(arr);
    System.out.println(Arrays.toString(arr)); //after sorting
  }
  
  static void bubblesort(int[] arr){
      for(int i=0; i<arr.length; i++){
        for(int j=1 ;j<arr.length-i; j++){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }
  }

}

