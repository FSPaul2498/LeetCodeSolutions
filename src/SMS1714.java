import java.util.Arrays;

public class SMS1714 {
    public int[] smallestK(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        System.arraycopy(arr, 0, result, 0, k);
        return result;
    }
}
