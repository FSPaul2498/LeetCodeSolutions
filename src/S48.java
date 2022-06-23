public class S48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                swap(matrix, i, j, n - i - 1, j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    private void swap(int[][] matrix, int ax, int ay, int bx, int by) {
        int tmp = matrix[ax][ay];
        matrix[ax][ay] = matrix[bx][by];
        matrix[bx][by] = tmp;
    }
}
