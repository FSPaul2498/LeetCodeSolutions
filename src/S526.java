import java.util.ArrayList;
import java.util.List;

public class S526 {
    List<List<Integer>> table = new ArrayList<>(16);
    boolean[] used = new boolean[16];
    int result;

    public int countArrangement(int n) {
        table.add(new ArrayList<>());
        for (int i = 1; i <= n; i++) {
            table.add(new ArrayList<>());
            for (int j = 1; j <= n; j++)
                if (i % j == 0 || j % i == 0)
                    table.get(i).add(j);
        }
        backtrack(1, n);
        return result;
    }

    public void backtrack(int index, int n) {
        if (index == n + 1) {
            result++;
            return;
        }
        for (int i : table.get(index)) {
            if (!used[i]) {
                used[i] = true;
                backtrack(index + 1, n);
                used[i] = false;
            }
        }
    }
}
