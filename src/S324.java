import java.util.Arrays;

public class S324 {
    public void wiggleSort(int[] nums) {
        int len = nums.length;
        int[] clone = nums.clone();
        Arrays.sort(clone);
        int pos = 0;
        for (int i = (len & 1) == 1 ? len - 1 : len - 2; i >= 0; i -= 2) {
            nums[i] = clone[pos++];
        }
        for (int i = (len & 1) == 1 ? len - 2 : len - 1; i >= 0; i -= 2) {
            nums[i] = clone[pos++];
        }
    }
}
