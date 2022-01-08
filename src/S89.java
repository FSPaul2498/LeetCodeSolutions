import java.util.ArrayList;
import java.util.List;

public class S89 {
    public List<Integer> grayCode(int n) {
        int[] pow = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536};
        List<Integer> grey = new ArrayList<>(pow[n]);
        for (int i = 0; i < 1 << n; i++) {
            grey.add(i ^ i >> 1);
        }
        return grey;
    }
}
