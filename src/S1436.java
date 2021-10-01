import java.util.HashMap;
import java.util.List;

public class S1436 {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> p : paths) map.put(p.get(0), p.get(1));
        String ans = paths.get(0).get(1);
        while (map.containsKey(ans)) ans = map.get(ans);
        return ans;
    }
}
