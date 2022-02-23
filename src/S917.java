public class S917 {
    public String reverseOnlyLetters(String s) {
        char[] reversed = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (true) {
            while (l < r && !Character.isLetter(reversed[l])) l++;
            while (l < r && !Character.isLetter(reversed[r])) r--;
            if (l >= r) break;
            char tmp = reversed[l];
            reversed[l] = reversed[r];
            reversed[r] = tmp;
            l++;
            r--;
        }
        return String.valueOf(reversed);
    }
}
