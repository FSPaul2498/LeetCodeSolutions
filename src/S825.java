import java.util.Arrays;

public class S825 {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, l = 0, r = 0, requests = 0;
        for (int age : ages) {
            if (age < 15) continue;
            while (ages[l] <= 0.5 * age + 7) l++;
            while (r + 1 < n && ages[r + 1] <= age) r++;
            requests += r - l;
        }
        return requests;
    }
}
