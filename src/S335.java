public class S335 {
    public boolean isSelfCrossing(int[] distance) {
        int n = distance.length, i = 2;
        if (n < 4) return false;
        for (; i < n; i++)
            if (distance[i] <= distance[i - 2]) break;
        if (i == n) return false;
        if (i < 3) i++;
        else {
            if (i == 3 && distance[i] < distance[i - 2]) i++;
            else if (i > 3 && distance[i] < distance[i - 2] - distance[i - 4]) i++;
            else {
                i++;
                if (i == n) return false;
                if (distance[i] >= distance[i - 2] - distance[i - 4]) return true;
                else i++;
            }
        }
        for (; i < n; i++)
            if (distance[i] >= distance[i - 2]) return true;
        return false;
    }
}
