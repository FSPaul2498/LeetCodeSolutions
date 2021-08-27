import java.util.PriorityQueue;

public class S295 {
    //class MedianFinder
    PriorityQueue<Integer> left, right;

    public S295() {
        left = new PriorityQueue<>((t1, t2) -> t2 - t1);
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (left.isEmpty()) {
            left.add(num);
        } else if (num < left.peek()) {
            left.add(num);
            balance();
        } else if (right.isEmpty()) {
            right.add(num);
        } else if (num > right.peek()) {
            right.add(num);
            balance();
        } else {
            if (left.size() > right.size()) right.add(num);
            else left.add(num);
        }
    }

    public double findMedian() {
        if (left.size() > right.size()) return left.peek();
        if (right.size() > left.size()) return right.peek();
        if (right.isEmpty()) return 0;
        return (double) (left.peek() + right.peek()) / 2;
    }

    void balance() {
        if (left.size() - right.size() > 1) right.add(left.poll());
        else if (right.size() - left.size() > 1) left.add(right.poll());
    }
}
