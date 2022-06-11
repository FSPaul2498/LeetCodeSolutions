public class S926 {
    public int minFlipsMonoIncr(String s) {
        int zeroR = 0, oneL = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') zeroR++;
        }
        int minFlips = zeroR;
        for (char ch : s.toCharArray()) {
            if (ch == '0') zeroR--;
            else oneL++;
            minFlips = Math.min(minFlips, zeroR + oneL);
        }
        return minFlips;
    }
}
