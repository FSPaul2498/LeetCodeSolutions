public class S1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int[] booking : bookings) {
            int first = booking[0], last = booking[1], seats = booking[2];
            result[first - 1] += seats;
            if (last < n) result[last] -= seats;
        }
        for (int i = 1; i < n; i++)
            result[i] += result[i - 1];
        return result;
    }
}
