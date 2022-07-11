class MagicDictionary {
    Trie trieRoot;

    public MagicDictionary() {
        trieRoot = new Trie();
    }

    public void buildDict(String[] dictionary) {
        for (String s : dictionary) {
            Trie ptr = trieRoot;
            for (char ch : s.toCharArray()) {
                int c = ch - 'a';
                if (ptr.children[c] == null) {
                    ptr.children[c] = new Trie();
                }
                ptr = ptr.children[c];
            }
            ptr.isEnd = true;
        }
    }

    public boolean search(String searchWord) {
        return dfs(searchWord, trieRoot, 0, false);
    }

    private boolean dfs(String searchWord, Trie node, int pos, boolean isMod) {
        if (pos == searchWord.length()) {
            return isMod && node.isEnd;
        }
        int c = searchWord.charAt(pos) - 'a';
        if (node.children[c] != null) {
            if (dfs(searchWord, node.children[c], pos + 1, isMod)) {
                return true;
            }
        }
        if (!isMod) {
            for (int i = 0; i < 26; ++i) {
                if (i != c && node.children[i] != null) {
                    if (dfs(searchWord, node.children[i], pos + 1, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
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
