import java.util.LinkedList;
import java.util.List;

public class S728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSDN(i)) list.add(i);
        }
        return list;
    }

    public boolean isSDN(int n) {
        for (int cp = n; cp > 0; cp /= 10) {
            if (cp % 10 == 0 || n % (cp % 10) != 0) {
                return false;
            }
        }
        return true;
    }
}
