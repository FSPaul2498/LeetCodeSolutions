import java.util.ArrayList;
import java.util.List;

public class S22 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        append(0, 0, 0, n, "");
        return result;
    }

    void append(int pos, int cnt, int unc, int n, String str) {
        if (pos == n * 2) {
            result.add(str);
            return;
        }
        if (unc < n) append(pos + 1, cnt + 1, unc + 1, n, str + '(');
        if (cnt > 0) append(pos + 1, cnt - 1, unc, n, str + ')');
    }
}
