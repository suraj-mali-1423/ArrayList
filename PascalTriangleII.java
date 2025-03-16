import java.net.Inet4Address;
import java.util.*;
public class PascalTriangleII {

    public static List<Integer> Pascle( int n ){
        List<List<Integer>> Result = new ArrayList<>();
        List<List<Integer>> Ans = new ArrayList<>();
        // Add the 1 In the Whole 2D ArrayList
        for ( int i = 0 ; i <= n; i++ ) {
            List<Integer> L = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    L.add(1);
                } else {
                    L.add((Result.get(i - 1).get(j)) + (Result.get(i - 1).get(j - 1)));
                }
            }
            Result.add(L);
        }

        return Result.get(n);
    }
    public static void main(String [] args) {

        List<Integer> Ans = Pascle(3);
        System.out.println(Ans);
    }
}
