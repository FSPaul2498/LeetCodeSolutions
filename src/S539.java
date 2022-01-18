import java.util.Arrays;
import java.util.List;

public class S539 {
    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size();
        if (len > 1440) return 0;
        int[] time = new int[len];
        for (int i = 0; i < len; i++) {
            String str = timePoints.get(i);
            time[i] = str.charAt(0) * 600 + str.charAt(1) * 60 + str.charAt(3) * 10 + str.charAt(4);
        }
        Arrays.sort(time);
        int min = time[0] + 1440 - time[len - 1];
        for (int i = 1; i < len; i++) {
            min = Math.min(min, time[i] - time[i - 1]);
        }
        return min;
    }
}
