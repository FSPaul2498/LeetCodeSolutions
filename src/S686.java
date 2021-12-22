public class S686 {
    public int repeatedStringMatch(String a, String b) {
        int maxTimes = b.length() / a.length() + 2;
        String c = a;
        for (int t = 1; t <= maxTimes; t++) {
            if (c.contains(b)) return t;
            else c = c.concat(a);
        }
        return -1;
    }
}
