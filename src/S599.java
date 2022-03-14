import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class S599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int len1 = list1.length, len2 = list2.length;
        for (int idx1 = 0; idx1 < len1; idx1++) {
            map.put(list1[idx1], idx1);
        }
        List<String> result = new LinkedList<>();
        int minIdxSum = len1 + len2;
        for (int idx2 = 0; idx2 < len2; idx2++) {
            if (idx2 > minIdxSum) break;
            if (map.containsKey(list2[idx2])) {
                int idxSum = map.get(list2[idx2]) + idx2;
                if (idxSum == minIdxSum) result.add(list2[idx2]);
                else if (idxSum < minIdxSum) {
                    minIdxSum = idxSum;
                    result.clear();
                    result.add(list2[idx2]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
