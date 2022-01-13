public class S747 {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            if (n >= a) {
                b = a;
                a = n;
                index = i;
            } else if (n >= b) b = n;
        }
        return a >= b * 2 ? index : -1;
    }
}
