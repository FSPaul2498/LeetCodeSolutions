public class S1748 {
    public int sumOfUnique(int[] nums) {
        int[] times = new int[101];
        int sum = 0;
        for (int i : nums) {
            if (times[i] == 1) {
                sum -= i;
                times[i]++;
            }
            if (times[i] == 0) {
                sum += i;
                times[i]++;
            }
        }
        return sum;
    }
}
