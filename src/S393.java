public class S393 {
    public boolean validUtf8(int[] data) {
        int cnt = 0;
        for (int d : data) {
            if (cnt > 0) {
                if (d >> 6 != 2) return false;
                cnt--;
            } else if (d >> 7 == 0) {
                cnt = 0;
            } else if (d >> 5 == 0b110) {
                cnt = 1;
            } else if (d >> 4 == 0b1110) {
                cnt = 2;
            } else if (d >> 3 == 0b11110) {
                cnt = 3;
            } else {
                return false;
            }
        }
        return cnt == 0;
    }
}
