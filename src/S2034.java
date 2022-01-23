import java.util.HashMap;
import java.util.TreeMap;

class StockPrice {
    HashMap<Integer, Integer> timeline;
    TreeMap<Integer, Integer> priceTime;
    int lastTime = -1;

    public StockPrice() {
        timeline = new HashMap<>();
        priceTime = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        if (timestamp > lastTime) lastTime = timestamp;
        if (timeline.containsKey(timestamp)) {
            int outPrice = timeline.get(timestamp);
            if (priceTime.get(outPrice) == 1) priceTime.remove(outPrice);
            else priceTime.put(outPrice, priceTime.get(outPrice) - 1);
        }
        timeline.put(timestamp, price);
        priceTime.put(price, priceTime.getOrDefault(price, 0) + 1);
    }

    public int current() {
        return timeline.get(lastTime);
    }

    public int maximum() {
        return priceTime.lastKey();
    }

    public int minimum() {
        return priceTime.firstKey();
    }
}

/*
  Your StockPrice object will be instantiated and called as such:
  StockPrice obj = new StockPrice();
  obj.update(timestamp,price);
  int param_2 = obj.current();
  int param_3 = obj.maximum();
  int param_4 = obj.minimum();
 */