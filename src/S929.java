import java.util.HashSet;
import java.util.Set;

public class S929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> addr = new HashSet<>();
        for (String email : emails) {
            int at = email.indexOf('@');
            String localName = email.substring(0, at);
            int plus = localName.indexOf('+');
            if (plus > 0) localName = localName.substring(0, plus);
            addr.add(localName.replace(".", "") + email.substring(at));
        }
        return addr.size();
    }
}
