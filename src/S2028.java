import java.util.Arrays;

public class S2028 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int rest = (rolls.length + n) * mean;
        for (int roll : rolls) rest -= roll;
        if (rest > 6 * n || rest < n) return new int[0];
        int[] missing = new int[n];
        int avg = rest / n;
        Arrays.fill(missing, avg);
        Arrays.fill(missing, 0, rest - avg * n, avg + 1);
        return missing;
    }
}
