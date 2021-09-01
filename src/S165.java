public class S165 {
    public int compareVersion(String version1, String version2) {
        int n1 = version1.length(), n2 = version2.length();
        int p1 = 0, p2 = 0, p1r, p2r, v1, v2;
        while (p1 < n1 || p2 < n2) {
            p1r = p1;
            p2r = p2;
            if (p1r >= n1) v1 = 0;
            else {
                while (p1r < n1 && version1.charAt(p1r) != '.') p1r++;
                v1 = Integer.parseInt(version1.substring(p1, p1r));
                p1 = p1r + 1;
            }
            if (p2r >= n2) v2 = 0;
            else {
                while (p2r < n2 && version2.charAt(p2r) != '.') p2r++;
                v2 = Integer.parseInt(version2.substring(p2, p2r));
                p2 = p2r + 1;
            }
            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
        }
        return 0;
    }
}
