import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class S846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;
        Arrays.sort(hand);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        for (int card : map.keySet()) {
            while (map.get(card) != 0) {
                for (int uCard = card; uCard < card + groupSize; uCard++) {
                    if (map.getOrDefault(uCard, 0) == 0) return false;
                    map.put(uCard, map.get(uCard) - 1);
                }
            }
        }
        return true;
    }
}
