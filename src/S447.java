import java.util.HashMap;

public class S447 {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for (int[] p : points) {
            HashMap<Integer, Integer> distCnt = new HashMap<>();
            for (int[] q : points) {
                int dist = (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
                distCnt.put(dist, distCnt.getOrDefault(dist, 0) + 1);
            }
            for (HashMap.Entry<Integer, Integer> entry : distCnt.entrySet()) {
                int num = entry.getValue();
                result += num * (num - 1);
            }
        }
        return result;
    }
}