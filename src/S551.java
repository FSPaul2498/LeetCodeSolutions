public class S551 {
    public boolean checkRecord(String s) {
        int cntA = 0, cntL = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') cntL++;
            else cntL = 0;
            if (ch == 'A') cntA++;
            if (cntA >= 2 || cntL >= 3) return false;
        }
        return true;
    }
}
