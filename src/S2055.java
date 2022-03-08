public class S2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int len = s.length();
        int[] preSum = new int[len];
        for (int i = 0, sum = 0; i < len; i++) {
            if (s.charAt(i) == '*') sum++;
            preSum[i] = sum;
        }
        int[] left = new int[len];
        for (int i = 0, l = -1; i < len; i++) {
            if (s.charAt(i) == '|') l = i;
            left[i] = l;
        }
        int[] right = new int[len];
        for (int i = len - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') r = i;
            right[i] = r;
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x = right[query[0]], y = left[query[1]];
            result[i] = x == -1 || y == -1 || x >= y ? 0 : preSum[y] - preSum[x];
        }
        return result;
    }
}
