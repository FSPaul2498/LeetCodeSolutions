public class S8 {
    public int myAtoi(String s) {
        // Using regex pattern = "^[+-]?\\d+"
        // It's more concise but runs REALLY SLOW (about 15ms)
        s = s.trim();
        int start = 0, end = 0, n = s.length();
        if (n == 0) return 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-')
            start = end = 1;
        while (end < n && s.charAt(end) >= '0' && s.charAt(end) <= '9')
            end++;
        if (start == end) return 0;
        try {
            return Integer.parseInt(s.substring(0, end));
        } catch (NumberFormatException e) {
            return s.charAt(0) == '-' ? -2147483648 : 2147483647;
        }
    }
}
