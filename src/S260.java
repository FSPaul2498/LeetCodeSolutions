public class S260 {
    public int[] singleNumber(int[] nums) {
        int xor = 0, a = 0, b = 0;
        for (int num : nums) xor ^= num;
        int bitDiff = xor == Integer.MIN_VALUE ? xor : xor & -xor;
        for (int num : nums) {
            if ((num & bitDiff) == 0) a ^= num;
            else b ^= num;
        }
        return new int[]{a, b};
    }
}
