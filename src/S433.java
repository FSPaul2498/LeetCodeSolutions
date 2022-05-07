import java.util.*;

public class S433 {
    public int minMutation(String start, String end, String[] bank) {
        Set<String> set = new HashSet<>(List.of(bank));
        if (start.equals(end)) return 0;
        if (!set.contains(end)) return -1;
        char[] base = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        int steps = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int cnt = 0; cnt < size; cnt++) {
                String oldGene = queue.remove();
                for (int i = 0; i < 8; i++) {
                    for (char b : base) {
                        StringBuilder sb = new StringBuilder(oldGene);
                        sb.setCharAt(i, b);
                        String modGene = sb.toString();
                        if (modGene.equals(end)) return steps;
                        if (set.contains(modGene)) {
                            set.remove(modGene);
                            queue.add(modGene);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
