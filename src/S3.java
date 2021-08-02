public class S3 {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0, end = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            int search = s.indexOf(s.charAt(i), begin);
            if (search == i) end = i;
            else begin = search + 1;
            result = Math.max(result, end - begin + 1);
        }
        return result;
    }
}
