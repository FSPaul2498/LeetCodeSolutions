import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                pairs.clear();
                List<Integer> p = new ArrayList<>(2);
                p.add(arr[i - 1]);
                p.add(arr[i]);
                pairs.add(p);
            } else if (diff == minDiff) {
                List<Integer> p = new ArrayList<>(2);
                p.add(arr[i - 1]);
                p.add(arr[i]);
                pairs.add(p);
            }
        }
        return pairs;
    }
}
