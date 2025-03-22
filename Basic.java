import java.util.*;
public class Basic {
    public static void main(String[] args) {
        List<Integer>Arr1 = new ArrayList<>();
        // Add the Element in the arrayList .
        Arr1.add(10);
        Arr1.add(20);
        Arr1.add(30);
        Arr1.add(40);
        System.out.println(Arr1);

        // Add the Element in another list .
        List<Integer> Arr2 = new ArrayList<>();
        Arr2.add(50);
        Arr2.add(60);
        Arr2.add(70);
        Arr2.add(80);

        // Add the Both ArrayList Arr1 And Arr2 In the Main 2D ArrayList .
        List<List<Integer>> Main = new ArrayList<>();
        Main.add(Arr1);
        Main.add(Arr2);

        for (int i = 0; i < Main.size(); i++) {
            for (int j = 0; j < (Main.get(i).size()); j++) {
                System.out.print(Main.get(i).get(j)+" ");
            }
        }

    }
}
