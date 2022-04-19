public class S821 {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] dist = new int[len];
        for (int i = 0, distL = len * 2; i < len; i++) {
            if (s.charAt(i) == c) distL = 0;
            dist[i] = distL;
            distL++;
        }
        for (int i = len - 1, distR = len * 2; i >= 0; i--) {
            if (s.charAt(i) == c) distR = 0;
            dist[i] = Math.min(dist[i], distR);
            distR++;
        }
        return dist;
    }
}
