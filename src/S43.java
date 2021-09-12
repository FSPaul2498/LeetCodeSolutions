public class S43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length(), len2 = num2.length();
        char[] result = new char[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--)
            for (int j = len2 - 1; j >= 0; j--)
                result[i + j + 1] += (num1.charAt(i) - 48) * (num2.charAt(j) - 48);
        for (int k = len1 + len2 - 1; k > 0; k--) {
            result[k - 1] += result[k] / 10;
            result[k] = (char) (result[k] % 10 + 48);
        }
        result[0] += 48;
        StringBuilder sb = new StringBuilder(String.valueOf(result));
        if (sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.toString();
    }
}
