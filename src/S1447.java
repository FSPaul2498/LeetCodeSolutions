import java.util.LinkedList;
import java.util.List;

public class S1447 {
    public List<String> simplifiedFractions(int n) {
        List<String> result = new LinkedList<>();
        for (int a = 2; a <= n; a++) {
            for (int b = 1; b < a; b++) {
                if (gcd(b, a) == 1) {
                    result.add(b + "/" + a);
                }
            }
        }
        return result;
    }

    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}
