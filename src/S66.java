public class S66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i--) {
            digits[i]++;
            if (digits[i] < 10) return digits;
            else digits[i] = 0;
        }
        digits[0]++;
        if (digits[0] < 10) return digits;
        else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}
