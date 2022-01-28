import java.util.Arrays;

public class S1996 {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        int cnt = 0, def = 0;
        for (int[] prop : properties) {
            if (prop[1] < def) cnt++;
            else def = prop[1];
        }
        return cnt;
    }
}
