public class S1446 {
    public int maxPower(String s) {
        char mem = '#';
        int power = 1, maxPower = 1;
        for (char ch : s.toCharArray()) {
            if (ch == mem) {
                power++;
                if (power > maxPower) maxPower = power;
            } else {
                mem = ch;
                power = 1;
            }
        }
        return maxPower;
    }
}
