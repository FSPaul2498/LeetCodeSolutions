public class S9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int y = 0, tmp = x;
        while (tmp != 0) {
            y = y * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return x == y;
    }
}
