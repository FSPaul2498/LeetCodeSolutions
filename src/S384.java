public class S384 {
    int[] nums;

    public S384(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] sNums = nums.clone();
        for (int i = sNums.length - 1; i >= 0; i--) {
            int swap = (int) (Math.random() * (i + 1));
            int tmp = sNums[swap];
            sNums[swap] = sNums[i];
            sNums[i] = tmp;
        }
        return sNums;
    }
}
