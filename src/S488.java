import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class S488 {
    static class Node {
        String a;
        int cur, val, step;

        Node(String _a, int _c, int _v, int _s) {
            a = _a;
            cur = _c;
            val = _v;
            step = _s;
        }
    }

    int f(String a, int k) {
        Map<Character, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++)
            m1.put(a.charAt(i), m1.getOrDefault(a.charAt(i), 0) + 1);
        for (int i = 0; i < m; i++)
            if (((k >> i) & 1) == 0) m2.put(b.charAt(i), m2.getOrDefault(b.charAt(i), 0) + 1);
        int ans = 0;
        for (char c : m1.keySet()) {
            int c1 = m1.get(c), c2 = m2.getOrDefault(c, 0);
            if (c1 + c2 < 3) return INF;
            if (c1 < 3) ans += (3 - c1);
        }
        return ans;
    }

    int INF = 0x3f3f3f3f;
    String b;
    int m;
    Map<String, Integer> map = new HashMap<>();

    public int findMinStep(String board, String hand) {
        b = hand;
        m = b.length();
        PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparingInt(o -> (o.val + o.step)));
        q.add(new Node(board, 1 << m, f(board, 1 << m), 0));
        map.put(board, 0);
        while (!q.isEmpty()) {
            Node poll = q.poll();
            String a = poll.a;
            int cur = poll.cur;
            int step = poll.step;
            int n = a.length();
            for (int i = 0; i < m; i++) {
                if (((cur >> i) & 1) == 1) continue;
                int next = (1 << i) | cur;
                for (int j = 0; j <= n; j++) {
                    if (j > 0 && j < n - 1 && a.charAt(j) == a.charAt(j - 1)) continue;
                    if (j > 0 && j < n - 1 && a.charAt(j) != b.charAt(i)) continue;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a, 0, j).append(b.charAt(i));
                    if (j != n) sb.append(a.substring(j));
                    int k = j;
                    while (0 <= k && k < sb.length()) {
                        char c = sb.charAt(k);
                        int l = k, r = k;
                        while (l >= 0 && sb.charAt(l) == c) l--;
                        while (r < sb.length() && sb.charAt(r) == c) r++;
                        if (r - l - 1 >= 3) {
                            sb.delete(l + 1, r);
                            k = l >= 0 ? l : r;
                        } else break;
                    }
                    String nextStr = sb.toString();
                    if (nextStr.length() == 0) return step + 1;
                    if (f(nextStr, next) == INF) continue;
                    if (!map.containsKey(nextStr) || map.get(nextStr) > step + 1) {
                        map.put(nextStr, step + 1);
                        q.add(new Node(nextStr, next, f(nextStr, next), step + 1));
                    }
                }
            }
        }
        return -1;
    }
}
