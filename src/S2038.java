public class S2038 {
    public boolean winnerOfGame(String colors) {
        char[] c = colors.toCharArray();
        int alice = 0, bob = 0, len = c.length - 1;
        for (int i = 1; i < len; i++) {
            if (c[i - 1] == c[i] && c[i] == c[i + 1]) {
                if (c[i] == 'A') alice++;
                if (c[i] == 'B') bob++;
            }
        }
        return alice > bob;
    }
}
