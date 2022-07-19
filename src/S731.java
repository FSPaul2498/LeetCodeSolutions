import java.util.Map;
import java.util.TreeMap;

class MyCalendarTwo {
    TreeMap<Integer, Integer> books;

    public MyCalendarTwo() {
        books = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        int maxBook = 0;
        books.put(start, books.getOrDefault(start, 0) + 1);
        books.put(end, books.getOrDefault(end, 0) - 1);
        for (Map.Entry<Integer, Integer> entry : books.entrySet()) {
            if (entry.getKey() > end) return true;
            maxBook += entry.getValue();
            if (maxBook > 2) {
                books.put(start, books.getOrDefault(start, 0) - 1);
                books.put(end, books.getOrDefault(end, 0) + 1);
                return false;
            }
        }
        return true;
    }
}
