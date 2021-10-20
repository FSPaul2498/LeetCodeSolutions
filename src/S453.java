public class S453 {
    public int minMoves(int[] nums) {
        int sum = 0, min = 1000000001;
        for (int i : nums) {
            sum += i;
            if (min > i) min = i;
        }
        return sum - nums.length * min;
    }
}
