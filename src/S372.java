public class S372 {
    public int superPow(int a, int[] b) {
        return dfs(a, b, b.length - 1);
    }

    int dfs(int a, int[] b, int u) {
        if (u == -1) return 1;
        return pow(dfs(a, b, u - 1), 10) * pow(a, b[u]) % 1337;
    }

    int pow(int a, int b) {
        int ans = 1;
        a %= 1337;
        while (b-- > 0) ans = ans * a % 1337;
        return ans;
    }
}
