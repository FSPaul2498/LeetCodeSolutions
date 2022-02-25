public class S537 {
    public String complexNumberMultiply(String num1, String num2) {
        int idx1 = num1.indexOf('+'), idx2 = num2.indexOf('+');
        int a = Integer.parseInt(num1.substring(0, idx1));
        int b = Integer.parseInt(num1.substring(idx1 + 1, num1.length() - 1));
        int c = Integer.parseInt(num2.substring(0, idx2));
        int d = Integer.parseInt(num2.substring(idx2 + 1, num2.length() - 1));
        int m = a * c - b * d;
        int n = b * c + a * d;
        return m + "+" + n + "i";
    }
}
