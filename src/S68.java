import java.util.ArrayList;
import java.util.List;

public class S68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        for (String word : words) {
            if (line.length() + word.length() <= maxWidth)
                line.append(word).append(" ");
            else {
                result.add(format(line, maxWidth, false));
                line = new StringBuilder(word + " ");
            }
        }
        result.add(format(line, maxWidth, true));
        return result;
    }

    String format(StringBuilder line, int maxWidth, boolean isLast) {
        if (isLast || line.indexOf(" ") == line.lastIndexOf(" ")) {
            if (line.length() > maxWidth) line.deleteCharAt(line.length() - 1);
            else while (line.length() < maxWidth) line.append(" ");
        } else {
            line.deleteCharAt(line.length() - 1);
            int pos = 0;
            while (line.length() < maxWidth) {
                while (line.charAt(pos) == ' ') pos++;
                pos = line.indexOf(" ", pos);
                if (pos == -1) pos = 0;
                else line.insert(pos, " ");
            }
        }
        return String.valueOf(line);
    }
}
