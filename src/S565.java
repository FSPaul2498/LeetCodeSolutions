public class S565 {
    public int arrayNesting(int[] nums) {
        int maxLoopLen = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            int j = i, loopLen = 0;
            while (nums[j] != -1) {
                loopLen++;
                int next = nums[j];
                nums[j] = -1;
                j = next;
            }
            maxLoopLen = Math.max(maxLoopLen, loopLen);
            if (maxLoopLen * 2 > len) break;
        }
        return maxLoopLen;
    }
}
