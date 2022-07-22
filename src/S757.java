import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S757 {
    public int intersectionSizeTwo(int[][] intervals) {
        int n = intervals.length, res = 0, m = 2;
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        List<Integer>[] temp = new List[n];
        for (int i = 0; i < n; i++) temp[i] = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = intervals[i][0], k = temp[i].size(); k < m; j++, k++) {
                res++;
                for (int ii = i - 1; ii >= 0; ii--) {
                    if (intervals[ii][1] < j) break;
                    temp[ii].add(j);
                }
            }
        }
        return res;
    }
}
