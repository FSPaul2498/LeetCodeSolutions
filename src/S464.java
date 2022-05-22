import java.util.HashMap;
import java.util.Map;

public class S464 {
    int maxChoosableInteger, desiredTotal;
    Map<Integer, Boolean> map = new HashMap<>();

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (maxChoosableInteger >= desiredTotal) {
            return true;
        }
        if ((1 + maxChoosableInteger) * (maxChoosableInteger) / 2 < desiredTotal) {
            return false;
        }
        this.maxChoosableInteger = maxChoosableInteger;
        this.desiredTotal = desiredTotal;
        return dfs(0, 0);
    }

    public boolean dfs(int usedNumbers, int currentTotal) {
        if (!map.containsKey(usedNumbers)) {
            boolean res = false;
            for (int i = 0; i < maxChoosableInteger; i++) {
                if (((usedNumbers >> i) & 1) == 0) {
                    if (i + 1 + currentTotal >= desiredTotal) {
                        res = true;
                        break;
                    }
                    if (!dfs(usedNumbers | (1 << i), currentTotal + i + 1)) {
                        res = true;
                        break;
                    }
                }
            }
            map.put(usedNumbers, res);
        }
        return map.get(usedNumbers);
    }
}
