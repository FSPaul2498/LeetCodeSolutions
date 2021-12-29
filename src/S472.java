import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class S472 {
    Trie472 trie = new Trie472();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (String word : words) {
            if (word.length() == 0) continue;
            boolean[] visited = new boolean[word.length()];
            if (dfs(word, 0, visited)) ans.add(word);
            else insert(word);
        }
        return ans;
    }

    public boolean dfs(String word, int start, boolean[] visited) {
        if (word.length() == start) return true;
        if (visited[start]) return false;
        visited[start] = true;
        Trie472 node = trie;
        for (int i = start; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            node = node.children[index];
            if (node == null) return false;
            if (node.isEnd) if (dfs(word, i + 1, visited)) return true;
        }
        return false;
    }

    public void insert(String word) {
        Trie472 node = trie;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) node.children[index] = new Trie472();
            node = node.children[index];
        }
        node.isEnd = true;
    }
}

class Trie472 {
    Trie472[] children;
    boolean isEnd;

    public Trie472() {
        children = new Trie472[26];
        isEnd = false;
    }
}