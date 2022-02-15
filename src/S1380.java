import java.util.ArrayList;
import java.util.List;

public class S1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int maxOfMin = Integer.MIN_VALUE, minOfMax = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int minOfRow = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                minOfRow = Math.min(minOfRow, matrix[i][j]);
            }
            maxOfMin = Math.max(maxOfMin, minOfRow);
        }
        for (int j = 0; j < n; j++) {
            int maxOfCol = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                maxOfCol = Math.max(maxOfCol, matrix[i][j]);
            }
            minOfMax = Math.min(minOfMax, maxOfCol);
        }
        List<Integer> result = new ArrayList<>();
        if (maxOfMin == minOfMax) result.add(maxOfMin);
        return result;
    }
}
