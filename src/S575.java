import java.util.HashSet;
import java.util.Set;

public class S575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> alice = new HashSet<>(candyType.length / 2);
        for (int candy : candyType) alice.add(candy);
        return Math.min(alice.size(), candyType.length / 2);
    }
}
