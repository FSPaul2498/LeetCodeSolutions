import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class S736 {
    Map<String, Deque<Integer>> scope = new HashMap<>();

    public int evaluate(String expression) {
        Deque<Deque<String>> vars = new ArrayDeque<>();
        int start = 0, n = expression.length();
        Deque<Expr> stack = new ArrayDeque<>();
        Expr cur = new Expr(ExprStatus.VALUE);
        while (start < n) {
            if (expression.charAt(start) == ' ') {
                start++;
                continue;
            }
            if (expression.charAt(start) == '(') {
                start++;
                stack.push(cur);
                cur = new Expr(ExprStatus.NONE);
                continue;
            }
            StringBuilder sb = new StringBuilder();
            if (expression.charAt(start) == ')') {
                start++;
                if (cur.status == ExprStatus.LET2) {
                    sb = new StringBuilder(Integer.toString(cur.value));
                    for (String var : vars.peek()) {
                        scope.get(var).pop();
                    }
                    vars.pop();
                } else if (cur.status == ExprStatus.ADD2) {
                    sb = new StringBuilder(Integer.toString(cur.e1 + cur.e2));
                } else {
                    sb = new StringBuilder(Integer.toString(cur.e1 * cur.e2));
                }
                cur = stack.pop();
            } else {
                while (start < n && expression.charAt(start) != ' ' && expression.charAt(start) != ')') {
                    sb.append(expression.charAt(start));
                    start++;
                }
            }
            String token = sb.toString();
            switch (cur.status.toString()) {
                case "VALUE":
                    cur.value = Integer.parseInt(token);
                    cur.status = ExprStatus.DONE;
                    break;
                case "NONE":
                    switch (token) {
                        case "let":
                            cur.status = ExprStatus.LET;
                            vars.push(new ArrayDeque<>());
                            break;
                        case "add":
                            cur.status = ExprStatus.ADD;
                            break;
                        case "mult":
                            cur.status = ExprStatus.MULT;
                            break;
                    }
                    break;
                case "LET":
                    if (expression.charAt(start) == ')') {
                        cur.value = calculateToken(token);
                        cur.status = ExprStatus.LET2;
                    } else {
                        cur.var = token;
                        vars.peek().push(token);
                        cur.status = ExprStatus.LET1;
                    }
                    break;
                case "LET1":
                    scope.putIfAbsent(cur.var, new ArrayDeque<>());
                    scope.get(cur.var).push(calculateToken(token));
                    cur.status = ExprStatus.LET;
                    break;
                case "ADD":
                    cur.e1 = calculateToken(token);
                    cur.status = ExprStatus.ADD1;
                    break;
                case "ADD1":
                    cur.e2 = calculateToken(token);
                    cur.status = ExprStatus.ADD2;
                    break;
                case "MULT":
                    cur.e1 = calculateToken(token);
                    cur.status = ExprStatus.MULT1;
                    break;
                case "MULT1":
                    cur.e2 = calculateToken(token);
                    cur.status = ExprStatus.MULT2;
                    break;
            }
        }
        return cur.value;
    }

    public int calculateToken(String token) {
        if (Character.isLowerCase(token.charAt(0))) {
            return scope.get(token).peek();
        } else {
            return Integer.parseInt(token);
        }
    }
}

enum ExprStatus {
    VALUE,     // ????????????
    NONE,      // ?????????????????????
    LET,       // let ?????????
    LET1,      // let ???????????????????????? vi ??????
    LET2,      // let ????????????????????????????????????????????? expr
    ADD,       // add ?????????
    ADD1,      // add ???????????????????????? e1 ?????????
    ADD2,      // add ???????????????????????? e2 ?????????
    MULT,      // mult ?????????
    MULT1,     // mult ???????????????????????? e1 ?????????
    MULT2,     // mult ???????????????????????? e2 ?????????
    DONE       // ????????????
}

class Expr {
    ExprStatus status;
    String var;
    int value;
    int e1, e2;

    public Expr(ExprStatus s) {
        status = s;
    }
}
