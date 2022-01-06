public class S71 {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = path.split("/");
        for (String part : sArr) {
            if (part.isEmpty() || part.equals(".")) continue;
            if (part.equals("..")) {
                if (sb.length() > 0) {
                    sb.delete(sb.lastIndexOf("/"), sb.length());
                }
            } else sb.append("/").append(part);
        }
        if (sb.length() == 0) return "/";
        return sb.toString();
    }
}
