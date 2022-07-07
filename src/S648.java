import java.util.List;

public class S648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trieRoot = new Trie();
        for (String s : dictionary) {
            Trie ptr = trieRoot;
            for (char ch : s.toCharArray()) {
                if (ptr.children[ch - 'a'] == null) {
                    ptr.children[ch - 'a'] = new Trie();
                }
                ptr = ptr.children[ch - 'a'];
            }
            ptr.isEnd = true;
        }
        String[] sp = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : sp) {
            sb.append(getRootWord(trieRoot, s)).append(" ");
        }
        return sb.toString().trim();
    }

    String getRootWord(Trie trie, String word) {
        StringBuilder rootWord = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (trie.children[ch - 'a'] == null) return word;
            rootWord.append(ch);
            trie = trie.children[ch - 'a'];
            if (trie.isEnd) return rootWord.toString();
        }
        return rootWord.toString();
    }

    static class Trie {
        Trie[] children;
        boolean isEnd;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }
    }
}


