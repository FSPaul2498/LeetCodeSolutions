public class S553 {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int len = nums.length;
        if (len == 1) return sb.append(nums[0]).toString();
        if (len == 2) return sb.append(nums[0]).append("/").append(nums[1]).toString();
        sb.append(nums[0]).append("/(");
        for (int i = 1; i < len; i++)
            sb.append(nums[i]).append("/");
        sb.setCharAt(sb.length() - 1, ')');
        return sb.toString();
    }
}
