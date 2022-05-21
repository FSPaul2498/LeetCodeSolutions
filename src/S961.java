public class S961 {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        while (true) {
            int a = (int) (System.nanoTime() % len), b = (int) (System.nanoTime() % len);
            if (a != b && nums[a] == nums[b]) {
                return nums[a];
            }
        }
    }
}
