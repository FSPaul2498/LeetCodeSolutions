import java.util.ArrayList;
import java.util.List;

public class S969 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> steps = new ArrayList<>(arr.length * 2);
        for (int n = arr.length; n > 1; n--) {
            int index = 0;
            while (arr[index] != n) index++;
            if (index == n - 1) continue;
            reverse(arr, index);
            steps.add(index + 1);
            reverse(arr, n - 1);
            steps.add(n);
        }
        return steps;
    }

    public void reverse(int[] arr, int end) {
        for (int i = 0; i * 2 < end; i++) {
            int tmp = arr[i];
            arr[i] = arr[end - i];
            arr[end - i] = tmp;
        }
    }
}
