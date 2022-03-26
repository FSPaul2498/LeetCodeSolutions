import java.util.ArrayList;
import java.util.List;

public class S682 {
    public int calPoints(String[] ops) {
        List<Integer> pt = new ArrayList<>(ops.length);
        for (String op : ops) {
            switch (op) {
                case "+":
                    pt.add(pt.get(pt.size() - 1) + pt.get(pt.size() - 2));
                    break;
                case "D":
                    pt.add(pt.get(pt.size() - 1) * 2);
                    break;
                case "C":
                    pt.remove(pt.size() - 1);
                    break;
                default:
                    pt.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (Integer i : pt) {
            sum += i;
        }
        return sum;
    }
}
