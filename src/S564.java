public class S564 {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        if (num < 11) return String.valueOf(num - 1);
        if (num == 11) return "9";
        long l = makePalindromic(n, 0);
        long a = makePalindromic(n, -1);
        long b = makePalindromic(n, 1);
        if (num < l) {
            return String.valueOf(((l - num) - (num - a) >= 0) ? a : l);
        } else if (num > l) {
            return String.valueOf(((b - num) - (num - l) >= 0) ? l : b);
        } else {
            return String.valueOf(((b - num) - (num - a) >= 0) ? a : b);
        }
    }

    long makePalindromic(String s, int offset) {
        int len = s.length();
        int half = Integer.parseInt(s.substring(0, (len + 1) / 2)) + offset;
        StringBuilder sb = new StringBuilder();
        sb.append(half).reverse().insert(0, half);
        if (len % 2 == 1) {
            sb.deleteCharAt(len / 2);
        }
        if (sb.length() < len) {
            sb = new StringBuilder("999999999999999999".substring(0, len - 1));
        }
        if (sb.length() > len) {
            sb = new StringBuilder("100000000000000000".substring(0, len)).append(1);
        }
        return Long.parseLong(sb.toString());
    }
}
