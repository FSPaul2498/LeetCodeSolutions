public class S859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int len = s.length();
        if (s.equals(goal)) {
            for (int i = 0; i < len; i++)
                if (s.lastIndexOf(s.charAt(i)) != i) return true;
            return false;
        }
        StringBuilder diff = new StringBuilder();
        for (int i = 0; i < len; i++)
            if (s.charAt(i) != goal.charAt(i))
                diff.append(s.charAt(i)).append(goal.charAt(i));
        if (diff.length() != 4) return false;
        return diff.charAt(0) == diff.charAt(3) && diff.charAt(1) == diff.charAt(2);
    }
}
