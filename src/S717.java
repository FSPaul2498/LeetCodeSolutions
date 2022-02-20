public class S717 {
    public boolean isOneBitCharacter(int[] bits) {
        int one = 0;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 0) break;
            one++;
        }
        return one % 2 == 0;
    }
}
