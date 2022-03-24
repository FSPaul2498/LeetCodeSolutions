public class S661 {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length, col = img[0].length;
        int[][] smooth = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0, cnt = 0;
                for (int a = i - 1; a <= i + 1; a++) {
                    for (int b = j - 1; b <= j + 1; b++) {
                        if (a >= 0 && a < row && b >= 0 && b < col) {
                            sum += img[a][b];
                            cnt++;
                        }
                    }
                }
                smooth[i][j] = sum / cnt;
            }
        }
        return smooth;
    }
}
