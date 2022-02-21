public class S838 {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] arr = dominoes.toCharArray();
        int[] value = new int[n];
        for (int i = 0, force = -1; i < n; i++) {
            if (arr[i] == 'L') {
                force = -1;
            } else if (arr[i] == 'R') {
                force = 100000;
                value[i] += force;
            } else if (force > -1) {
                value[i] += force--;
            }
        }
        for (int i = n - 1, force = -1; i >= 0; i--) {
            if (arr[i] == 'R') {
                force = -1;
            } else if (arr[i] == 'L') {
                force = 100000;
                value[i] -= force;
            } else if (force > -1) {
                value[i] -= force--;
            }
        }
        for (int i = 0; i < n; i++) {
            int v = value[i];
            if (v > 0) arr[i] = 'R';
            if (v < 0) arr[i] = 'L';
            if (v == 0) arr[i] = '.';
        }
        return String.valueOf(arr);
    }
}
