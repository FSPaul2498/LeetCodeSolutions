public class S318 {
    public int maxProduct(String[] words) {
        int len = words.length, maxProd = 0;
        int[] masks = new int[len];
        for (int i = 0; i < len; i++) {
            int mask = 0;
            for (char ch : words[i].toCharArray())
                mask |= 1 << (ch - 'a');
            masks[i] = mask;
        }
        for (int i = 0; i < len; i++)
            for (int j = i; j < len; j++)
                if ((masks[i] & masks[j]) == 0)
                    maxProd = Math.max(maxProd, words[i].length() * words[j].length());
        return maxProd;
    }
}
