import java.util.ArrayList;
import java.util.List;

public class S2100 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int len = security.length;
        List<Integer> days = new ArrayList<>();
        int[] dpL = new int[len], dpR = new int[len];
        for (int i = 1; i < len; i++) {
            if (security[i] <= security[i - 1]) dpL[i] = dpL[i - 1] + 1;
            int j = len - i - 1;
            if (security[j] <= security[j + 1]) dpR[j] = dpR[j + 1] + 1;
        }
        for (int i = time; i < len - time; i++) {
            if (dpL[i] >= time && dpR[i] >= time) days.add(i);
        }
        return days;
    }
}
