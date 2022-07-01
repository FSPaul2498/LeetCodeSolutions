import java.util.ArrayList;
import java.util.List;

public class S241 {
    public List<Integer> diffWaysToCompute(String expression) {
        final int ADD = -1, SUB = -2, MUL = -3;
        List<Integer> ops = new ArrayList<>();
        for (int i = 0; i < expression.length(); ) {
            if (!Character.isDigit(expression.charAt(i))) {
                if (expression.charAt(i) == '+') ops.add(ADD);
                else if (expression.charAt(i) == '-') ops.add(SUB);
                else ops.add(MUL);
                i++;
            } else {
                int t = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    t = t * 10 + expression.charAt(i) - '0';
                    i++;
                }
                ops.add(t);
            }
        }
        List<Integer>[][] dp = new List[ops.size()][ops.size()];
        for (int i = 0; i < ops.size(); i++) {
            for (int j = 0; j < ops.size(); j++) {
                dp[i][j] = new ArrayList<>();
            }
        }
        for (int i = 0; i < ops.size(); i += 2) {
            dp[i][i].add(ops.get(i));
        }
        for (int i = 3; i <= ops.size(); i++) {
            for (int j = 0; j + i <= ops.size(); j += 2) {
                int r = j + i - 1;
                for (int k = j + 1; k < r; k += 2) {
                    List<Integer> left = dp[j][k - 1];
                    List<Integer> right = dp[k + 1][r];
                    for (int num1 : left) {
                        for (int num2 : right) {
                            if (ops.get(k) == ADD) {
                                dp[j][r].add(num1 + num2);
                            } else if (ops.get(k) == SUB) {
                                dp[j][r].add(num1 - num2);
                            } else if (ops.get(k) == MUL) {
                                dp[j][r].add(num1 * num2);
                            }
                        }
                    }
                }
            }
        }
        return dp[0][ops.size() - 1];
    }
}
