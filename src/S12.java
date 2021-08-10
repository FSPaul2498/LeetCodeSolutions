public class S12 {
    public String intToRoman(int num) {
        int[] v = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            if (num >= v[i]) {
                result.append(s[i]);
                num -= v[i];
            } else i++;
        }
        return result.toString();
    }
}
