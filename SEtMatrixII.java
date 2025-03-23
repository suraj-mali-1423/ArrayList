public class SEtMatrixII {
    public static  void display( int [][] arr ){
       int n = arr.length;
       int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println();
    }
    // Mrthod One
     public static void SetZeroesMethod1( int [][] arr){
         int [][] Result = new int [3][3];
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 Result[i][j] = arr[i][j];
             }
         }

         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if(Result[i][j] == 0){
                     for (int k = 0; k < 3; k++) {
                         arr[i][k] = 0;
                     }
                     for (int m = 0; m < 3; m++) {
                         arr[m][j] = 0;
                     }

                 }
             }
         }
     }

    public static void SetZeroesMethod2( int [] [] arr ){
        int m = arr.length;
        int n = arr[0].length;

        boolean [] Row =  new boolean[m];
        boolean [] Col = new boolean[n];

        // Set the true value
        for ( int i = 0 ; i < m ; i++ ){
            for( int j = 0; j < n; j++ ){
                if(arr[i][j] == 0){
                    Row[i] = true;
                    Col[j] = true;
                }
            }
        }

        //  Flip the

        for ( int i = 0 ; i < m ; i++ ){
            if (Row[i] == true){
                for ( int j = 0; j < n; j++ ){
                    arr[i][j] = 0;
                }
            }
        }

        // row
        for ( int j = 0 ; j < n ; j++ ){
            if (Col[j] == true){
                for ( int i = 0; i < m; i++ ){
                    arr[i][j] = 0;
                }
            }
        }


    }

    public static void SetZeroesMethod3( int [][] arr ){
        int m = arr.length;
        int n = arr[0].length;
        boolean RowZero = false;
        boolean ColZero = false;

        // Check First Row
        for ( int i = 0 ; i < m ; i++ ){
             if( arr[i][0] == 0){
                 ColZero = true;
                 break;
             }
        }

        for( int j = 0 ; j < n; j++){
            if(arr[0][j] == 0) {
                 RowZero= true ;
                 break;
            }
        }

        // Then check
        for ( int i = 0 ; i < m ; i++){
            for (int j = 0; j < n; j++) {
                if( arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set the alll
        // Set the row
        for (int j = 0; j < n; j++) {
             if(arr[0][j] == 0){
                 for ( int i = 0 ; i < m ; i++ ){
                     arr[i][j] = 0;
                 }
             }
        }

        // Set the Col
        for (int i = 0; i < m; i++) {
            if(arr[i][0] == 0){
                for ( int j = 0 ; j < n ; j++ ){
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        display(arr);
        SetZeroesMethod3(arr);
        display(arr);
    }
}
