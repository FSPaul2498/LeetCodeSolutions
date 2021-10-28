import java.util.HashSet;
import java.util.Set;

public class S869 {
    Set<String> powerOf2Digits = new HashSet<>();

    public boolean reorderedPowerOf2(int n) {
        for (int i = 1; i <= 1e9; i <<= 1)
            powerOf2Digits.add(countDigits(i));
        return powerOf2Digits.contains(countDigits(n));
    }

    public String countDigits(int n) {
        char[] cnt = new char[10];
        while (n > 0) {
            cnt[n % 10]++;
            n /= 10;
        }
        return new String(cnt);
    }
}