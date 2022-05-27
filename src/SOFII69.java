public class SOFII69 {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[arr.length - 1] > arr[arr.length - 2]) return arr.length - 1;
        int l = 1, r = arr.length - 1, m = 0;
        while (l < r) {
            m = (l + r) / 2;
            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) return m;
            if (arr[m] > arr[m - 1]) l = m;
            else r = m;
        }
        return m;
    }
}
