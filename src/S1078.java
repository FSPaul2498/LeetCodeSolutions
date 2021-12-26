import java.util.ArrayList;
import java.util.List;

public class S1078 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        String[] ts = text.split(" ");
        int n = ts.length;
        for (int i = 2; i < n; i++)
            if (first.equals(ts[i - 2]) && second.equals(ts[i - 1])) result.add(ts[i]);
        return result.toArray(new String[0]);
    }
}
