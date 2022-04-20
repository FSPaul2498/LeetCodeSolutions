public class S388 {
    public int lengthLongestPath(String input) {
        int maxLength = 0;
        String[] sp = input.split("\n");
        int[] pathLen = new int[sp.length + 1];
        pathLen[0] = -1;
        for (String s : sp) {
            int level = s.lastIndexOf('\t') + 2;
            int nameLen = s.length() - (level - 1);
            pathLen[level] = pathLen[level - 1] + 1 + nameLen;
            if (s.contains(".")) maxLength = Math.max(maxLength, pathLen[level]);
        }
        return maxLength;
    }
}
