import java.util.Arrays;
import java.util.LinkedList;

public class S457 {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        int[][] forward = new int[2][n];
        int[][] backward = new int[2][n];
        Arrays.fill(forward[0], -1);
        Arrays.fill(backward[0], -1);
        LinkedList<Integer> listA = new LinkedList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int target = (nums[i] + i) % n;
            if (target < 0) target += n;
            if (target == i) continue;
            if (nums[i] > 0) {
                forward[0][i] = target;
                forward[1][forward[0][i]]++;
            } else if (nums[i] < 0) {
                backward[0][i] = target;
                backward[1][backward[0][i]]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (forward[0][i] >= 0 && forward[1][i] <= 0) listA.add(i);
            if (backward[0][i] >= 0 && backward[1][i] <= 0) listB.add(i);
        }
        while (!listA.isEmpty()) {
            int check = listA.pop();
            int target = forward[0][check];
            forward[1][target]--;
            if (forward[0][target] >= 0 && forward[1][target] <= 0) listA.add(target);
        }
        while (!listB.isEmpty()) {
            int check = listB.pop();
            int target = backward[0][check];
            backward[1][target]--;
            if (backward[0][target] >= 0 && backward[1][target] <= 0) listB.add(target);
        }
        for (int i = 0; i < n; i++) {
            if (forward[1][i] > 0) return true;
            if (backward[1][i] > 0) return true;
        }
        return false;
    }
}
