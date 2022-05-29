public class S468 {
    public String validIPAddress(String queryIP) {
        if (queryIP.length() == 0) return "Neither";
        if (isV4(queryIP)) return "IPv4";
        if (isV6(queryIP)) return "IPv6";
        return "Neither";
    }

    private boolean isV4(String IP) {
        if (IP.charAt(IP.length() - 1) == '.') return false;
        String[] sp = IP.split("\\.");
        if (sp.length != 4) return false;
        for (String part : sp) {
            if (!isV4Part(part)) return false;
        }
        return true;
    }

    private boolean isV4Part(String part) {
        if (part.length() > 3 || part.length() < 1) return false;
        if (part.charAt(0) == '0' && part.length() > 1) return false;
        try {
            int n = Integer.parseInt(part);
            return n < 256;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isV6(String IP) {
        if (IP.charAt(IP.length() - 1) == ':') return false;
        String[] sp = IP.split(":");
        if (sp.length != 8) return false;
        for (String part : sp) {
            if (!isV6Part(part)) return false;
        }
        return true;
    }

    private boolean isV6Part(String part) {
        if (part.length() > 4 || part.length() < 1) return false;
        try {
            int n = Integer.parseInt(part, 16);
            return n < 65536;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
