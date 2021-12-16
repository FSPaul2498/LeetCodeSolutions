import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S1610 {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int sameCnt = 0;
        List<Double> polarDegrees = new ArrayList<>();
        int locationX = location.get(0);
        int locationY = location.get(1);
        for (List<Integer> point : points) {
            if (point.get(0) == locationX && point.get(1) == locationY) sameCnt++;
            else {
                Double degree = Math.atan2(point.get(1) - locationY, point.get(0) - locationX);
                polarDegrees.add(degree);
            }
        }
        Collections.sort(polarDegrees);
        int m = polarDegrees.size();
        for (int i = 0; i < m; ++i) {
            polarDegrees.add(polarDegrees.get(i) + 2 * Math.PI);
        }
        int maxCnt = 0;
        int right = 0;
        double toDegree = angle * Math.PI / 180;
        for (int i = 0; i < m; ++i) {
            Double curr = polarDegrees.get(i) + toDegree;
            while (right < polarDegrees.size() && polarDegrees.get(right) <= curr) {
                right++;
            }
            maxCnt = Math.max(maxCnt, right - i);
        }
        return maxCnt + sameCnt;
    }
}
