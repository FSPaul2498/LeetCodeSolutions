import java.util.ArrayList;

public class S6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        ArrayList<StringBuilder> rowList = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            rowList.add(new StringBuilder());
        int thisRow = 0, cnt = 0;
        boolean goDown = false;
        while (cnt < s.length()) {
            rowList.get(thisRow).append(s.charAt(cnt));
            if (thisRow == 0 || thisRow == numRows - 1)
                goDown = !goDown;
            thisRow += goDown ? 1 : -1;
            cnt++;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rowList) result.append(row);
        return result.toString();
    }
}
