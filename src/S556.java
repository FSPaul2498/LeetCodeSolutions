public class S556 {
    public int nextGreaterElement(int n) {
        char[] nums = String.valueOf(n).toCharArray();
        int pos = nums.length - 1;
        for (; pos > 0; pos--)
            if (nums[pos - 1] < nums[pos]) break;
        if (pos == 0) return -1;
        int target = pos;
        for (; target < nums.length; target++)
            if (nums[target] <= nums[pos - 1]) break;
        exchange(nums, pos - 1, target - 1);
        reverse(nums, pos, nums.length - 1);
        long result = Long.parseLong(String.valueOf(nums));
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }

    void reverse(char[] arr, int l, int r) {
        while (l < r) exchange(arr, l++, r--);
    }

    void exchange(char[] arr, int l, int r) {
        arr[l] ^= arr[r];
        arr[r] ^= arr[l];
        arr[l] ^= arr[r];
    }
}
