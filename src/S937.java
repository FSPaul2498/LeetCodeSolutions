import java.util.Arrays;

public class S937 {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            boolean aIsDigit = Character.isDigit(a.charAt(a.length() - 1));
            boolean bIsDigit = Character.isDigit(b.charAt(b.length() - 1));
            if (aIsDigit && bIsDigit) return 0;
            else if (aIsDigit) return 1;
            else if (bIsDigit) return -1;
            String[] aSplit = a.split(" ", 2), bSplit = b.split(" ", 2);
            int content = aSplit[1].compareTo(bSplit[1]);
            return content != 0 ? content : aSplit[0].compareTo(bSplit[0]);
        });
        return logs;
    }
}
