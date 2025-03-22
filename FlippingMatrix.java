public class FlippingMatrix {
    public static void main(String[] args) {
        int [][] arr = { {0,0,1,1}, {1,0,1,0},{1,1,0,0}};
        int n = arr.length;
        int m = arr[0].length;
        
        for ( int i = 0 ; i < n; i++){
           if (arr[i][0] == 0) {
               for (int j = 0; j < m; j++) {
                  if(arr[i][j] == 0){
                      arr[i][j] = 1;
                  }else{
                      arr[i][j] = 0;
                  }
               }
           }
        }

        // Flip those column no. of Zero more than 1
            for (int j = 1; j < m; j++) {
                int noofZero = 0;
                int noOfOne = 0 ;
                for (int i = 0; i < n; i++) {
                    if( arr[i][j] == 0 ) noofZero++;
                    else noOfOne++;
                }
                if ( noofZero > noOfOne) {
                    for (int i = 0; i < n; i++) {
                        if(arr[i][j] == 0){
                            arr[i][j] = 1;
                        }else{
                            arr[i][j] = 0;
                        }
                    }
                }
            }

            // Addintion Of the Number
         int Score = 0 ;
            int X = 1;
        for (int j = m-1; j >= 0 ; j--) {
            for (int i = 0 ; i < n; i++){
                Score += (arr[i][j] * X);
            }
            X *= 2;

        }
        System.out.println( Score);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j  < arr[0].length; j++){
                System.out.print(arr[i][j] +"  ");
            }
            System.out.println();
        }
    }
}
