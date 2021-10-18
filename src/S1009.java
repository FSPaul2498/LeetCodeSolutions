public class S1009 {
    public int bitwiseComplement(int n) {
        int highBit = 0;
        for (int i = 1; i <= 30; ++i) {
            if (n >= 1 << i) highBit = i;
            else break;
        }
        int mask = highBit == 30 ? 0x7fffffff : (1 << (highBit + 1)) - 1;
        return n ^ mask;
    }
}
