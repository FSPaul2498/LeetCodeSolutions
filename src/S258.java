public class S258 {
    public int addDigits(int num) {
        int sum = num;
        while (sum > 9) {
            num = sum;
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}
