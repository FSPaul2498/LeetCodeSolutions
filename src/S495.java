public class S495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length, result = duration;
        for (int i = 1; i < n; i++)
            result += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        return result;
    }
}
