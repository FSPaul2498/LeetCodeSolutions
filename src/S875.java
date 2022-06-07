public class S875 {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            long time = getTime(piles, speed);
            if (time <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return k;
    }

    public long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            time += (pile + speed - 1) / speed;
        }
        return time;
    }
}
