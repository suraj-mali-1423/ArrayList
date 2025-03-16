public class MultiTwoMatrix {
    public static int [][] MultiMatrix ( int [][] a , int [][] b){
          int p = a.length;
          int q = a[0].length;
          int m = b.length;
          int n = b[0].length;
        int [][] Result = new int[p][n];
          if ( q != m ){
              System.out.println(" Matrix Multiplication is Not possible!");
              return null;
          }
              for (int i = 0; i < p; i++) {
                  for ( int j = 0 ; j < n; j++){
                      for ( int k = 0 ; k < q; k++ ){
                          Result[i][j] += a[i][k]*b[k][j];
                      }
                  }
              }
          return Result;
    }
    public static void main(String[] args) {
        int [][] a = {{1,2},{3,4}};
        int [][] b = {{5,6},{7,8}};

        System.out.println("Element Of A Matrix :");
        for (int i = 0 ; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Element Of B Matrix :");
        for (int i = 0 ; i < b.length; i++){
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();



         int [][] ans = MultiMatrix(a,b);
        System.out.println("Multiplication Of the Above two matrix : ");
         for (int i = 0 ; i < a.length; i++){
             for (int j = 0; j < a[0].length; j++) {
                 System.out.print(ans[i][j]+" ");
             }
             System.out.println();
         }

    }
}
