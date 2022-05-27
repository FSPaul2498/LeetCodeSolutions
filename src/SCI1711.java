public class SCI1711 {
    public int findClosest(String[] words, String word1, String word2) {
        int idx1 = -100000, idx2 = -200000, closest = words.length;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                idx1 = i;
                closest = Math.min(closest, Math.abs(idx1 - idx2));
            } else if (word.equals(word2)) {
                idx2 = i;
                closest = Math.min(closest, Math.abs(idx1 - idx2));
            }
        }
        return closest;
    }
}
