import java.util.ArrayList;
import java.util.List;

public class S386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);
        for (int i = 1; i < 10; i++) dfs(i, n, result);
        return result;
    }

    public void dfs(int start, int n, List<Integer> result) {
        if (start > n) return;
        result.add(start);
        for (int i = 0; i < 10; i++) {
            if (start * 10 + i > n) break;
            dfs(start * 10 + i, n, result);
        }
    }
}
