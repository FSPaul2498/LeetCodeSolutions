import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S506 {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        int len = score.length;
        for (int i = 0; i < len; i++) map.put(sorted[i], i);
        String[] ranks = new String[len];
        for (int i = 0; i < len; i++) {
            int rank = len - map.get(score[i]);
            if (rank > 3) ranks[i] = String.valueOf(rank);
            else if (rank == 3) ranks[i] = "Bronze Medal";
            else if (rank == 2) ranks[i] = "Silver Medal";
            else if (rank == 1) ranks[i] = "Gold Medal";
        }
        return ranks;
    }
}
