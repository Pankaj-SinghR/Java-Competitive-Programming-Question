package BinarySearchIn2DArray;

import java.util.Arrays;

public class RowAndColumnSortedArray {
    public static void main(String[] args) {

        int[][] matrix = {
                //0   1  2   3
                {10, 20, 30, 40}, // 0
                {11, 25, 35, 45}, // 1
                {28, 29, 37, 49}, // 2
                {33, 34, 38, 50}  // 3
        };
        int target = 33;

        System.out.println(Arrays.toString(SearchIn2DArray(matrix, target)));

    }
    static int[] SearchIn2DArray(int[][] matrix, int target){
        int row= 0; int col = matrix[0].length -1;

        while (row < matrix.length && col >= 0){
            if(target == matrix[row][col]){
                return new int[]{row, col};
            }
            else if( matrix[row][col] < target){
                row++;
            }else{
                col--;
            }
        }//O(n+m) is the time complexity // O(1) is auxiliary space complexity
        return new int[]{-1, -1};
    }

}
