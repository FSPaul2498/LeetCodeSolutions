public class S1791 {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1], x = edges[1][0], y = edges[1][1];
        return a == x ? x : a == y ? y : b;
    }
}
