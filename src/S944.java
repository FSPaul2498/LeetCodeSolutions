public class S944 {
    public int minDeletionSize(String[] strs) {
        int col = strs[0].length(), cnt = 0;
        for (int i = 0; i < col; i++) {
            char ch = 'a';
            for (String s : strs) {
                if (s.charAt(i) < ch) {
                    cnt++;
                    break;
                } else ch = s.charAt(i);
            }
        }
        return cnt;
    }
}
