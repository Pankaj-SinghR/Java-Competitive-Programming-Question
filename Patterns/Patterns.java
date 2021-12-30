public class Patterns{

    public static void main(String[] args){
    

        pattern1(5);
        System.out.println();
        pattern2(5);
        //System.out.println();
        pattern5(5);
        //System.out.println();
        pattern30(5);
        pattern17(5);
        pattern31(4);
    }
    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            //for every row, run the col
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=1; i<=2*n; i++){
            int totalColsInRow = i>n ? 2*n -i:i;
            
            int noOfSpaces = n -totalColsInRow;
            for(int s = noOfSpaces; s< noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int j=1; j<totalColsInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int row=1; row<=n; row++){
            int noOfSpaces = n-row;
            for(int s=1; s<=noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int row=1; row<=2*n; row++){
            int noOfSpaces = row<n ? n-row: row-n;
            int noOfCol = n- noOfSpaces;
            for(int s=1; s<=noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int col=noOfCol; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=noOfCol; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        for(int row=0; row<= 2 * n; row++){
            for(int col=0; col<= 2 * n; col++){
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(2 * n-row, 2 * n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

}
