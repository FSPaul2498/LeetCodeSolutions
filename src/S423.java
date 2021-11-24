public class S423 {
    public String originalDigits(String s) {
        int[] chrCnt = new int[26];
        for (char ch : s.toCharArray())
            chrCnt[ch - 'a']++;
        int[] numCnt = new int[10];
        numCnt[0] = chrCnt['z' - 'a'];
        numCnt[2] = chrCnt['w' - 'a'];
        numCnt[4] = chrCnt['u' - 'a'];
        numCnt[6] = chrCnt['x' - 'a'];
        numCnt[8] = chrCnt['g' - 'a'];
        numCnt[1] = chrCnt['o' - 'a'] - numCnt[0] - numCnt[2] - numCnt[4];
        numCnt[3] = chrCnt['h' - 'a'] - numCnt[8];
        numCnt[5] = chrCnt['f' - 'a'] - numCnt[4];
        numCnt[7] = chrCnt['s' - 'a'] - numCnt[6];
        numCnt[9] = chrCnt['i' - 'a'] - numCnt[5] - numCnt[6] - numCnt[8];
        StringBuilder sb = new StringBuilder();
        for (int num = 0; num < 10; num++)
            sb.append(String.valueOf(num).repeat(numCnt[num]));
        return sb.toString();
    }
}
