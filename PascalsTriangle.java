import java.net.Inet4Address;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> Pascle( int n ){
        List<List<Integer>> Result = new ArrayList<>();

       n = n + 1;
        // Add the 1 In the Whole 2D ArrayList
        for ( int i = 0 ; i < n; i++ ){
            List<Integer> L = new ArrayList<>();
            for (int j = 0 ; j <= i ; j++ ){
                if (j == 0 || j == i){
                    L.add(1);
                }
                else{
                    L.add((Result.get(i-1).get(j)) + (Result.get(i-1).get(j-1)));
                }
            }
            Result.add(L);
        }
////         Update the iTh Row and j Index Value
//        for ( int i = 2; i < n ; i++ ){
//            for ( int j = 1 ; j < i ; j++){
//                Result.get(i).set(j , (Result.get(i-1).get(j) + (Result.get(i-1).get(j-1))));
//            }
//        }
        List<Integer> lastMatrix = Result.get(Result.size() -1);
        System.out.println(lastMatrix);
        return Result;
    }
    public static void main(String [] args) {

        List<List<Integer>> Ans = Pascle(3);


        for (int i = 0; i < Ans.size(); i++) {
            for (int j = 0; j < (Ans.get(i).size()); j++) {
                System.out.print(Ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
