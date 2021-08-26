import java.util.Arrays;

public class S881 {
    public int numRescueBoats(int[] people, int limit) {
        int result = 0, l = 0, r = people.length - 1;
        Arrays.sort(people);
        while (l <= r) {
            if (people[l] + people[r] <= limit) l++;
            r--;
            result++;
        }
        return result;
    }
}
