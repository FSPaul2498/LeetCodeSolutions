import java.util.TreeSet;

class MyCalendar {
    TreeSet<int[]> calendar;

    public MyCalendar() {
        calendar = new TreeSet<>((a, b) -> {
            if (a[1] <= b[0]) return -1;
            else if (a[0] >= b[1]) return 1;
            else return 0;
        });
    }

    public boolean book(int start, int end) {
        int[] e = new int[]{start, end};
        return calendar.add(e);
    }
}
