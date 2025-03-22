public class Search_2D_Matrix {
    public static boolean SearchMatrix( int [][] arr , int target){
           int n = arr.length; // Row
           int m = arr[0].length;

           int j = m - 1; // REpresen the row
           int i = 0;// Represent the column


           while( i < m && j >= 0){
               if( arr[i][j] == target) return true;
               else if ( arr[i][j] > target ){
                   j--;
               }
               else {
                   i++;
               }
           }

           return false;
    }




    public static void main(String[] args) {
        int [][] arr = {{-5}};
         int target = 6;

        System.out.println(SearchMatrix(arr , target));
    }
}
