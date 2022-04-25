import java.util.Random;

public class S398 {
    int[] nums;
    Random rand;

    public S398(int[] nums) {
        this.nums = nums;
        rand = new Random();
    }

    public int pick(int target) {
        int times = 0, result = -1;
        for (int pos = 0; pos < nums.length; pos++) {
            if (nums[pos] == target) {
                times++;
                if (rand.nextInt(times) == 0) result = pos;
            }
        }
        return result;
    }
}
