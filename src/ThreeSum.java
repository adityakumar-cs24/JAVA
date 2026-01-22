import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        Set<ArrayList<Integer>> flist = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[i] + arr[j] + arr[k] == 0) && i != j && j != k && i != k) {

                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
//                        ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));
                        flist.add(list);
                    }
                }
            }
        }
        System.out.println(flist);
    }
}
