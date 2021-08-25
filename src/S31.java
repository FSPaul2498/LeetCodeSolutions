public class S31 {
    public void nextPermutation(int[] nums) {
        int pos = nums.length - 1;
        for (; pos > 0; pos--)
            if (nums[pos - 1] < nums[pos]) break;
        if (pos > 0) {
            int target = pos;
            for (; target < nums.length; target++)
                if (nums[target] <= nums[pos - 1]) break;
            swap(nums, pos - 1, target - 1);
        }
        reverse(nums, pos, nums.length - 1);
    }

    void reverse(int[] arr, int l, int r) {
        while (l < r) swap(arr, l++, r--);
    }

    void swap(int[] arr, int l, int r) {
        arr[l] ^= arr[r];
        arr[r] ^= arr[l];
        arr[l] ^= arr[r];
    }
}
