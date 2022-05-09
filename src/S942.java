public class S942 {
    public int[] diStringMatch(String s) {
        int len = s.length(), min = 0, max = len;
        int[] perm = new int[len + 1];
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'I') perm[i] = min++;
            else perm[i] = max--;
        }
        perm[len] = min;
        return perm;
    }
}
