import java.util.Arrays;

public class S4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        Arrays.sort(nums3);
        if (nums3.length % 2 == 0)
            return (double) (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2]) / 2;
        else
            return nums3[nums3.length / 2];
    }
}
