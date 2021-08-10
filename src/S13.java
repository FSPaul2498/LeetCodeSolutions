public class S13 {
    public int romanToInt(String s) {
        s = s.replace("CM", "m");
        s = s.replace("CD", "d");
        s = s.replace("XC", "c");
        s = s.replace("XL", "l");
        s = s.replace("IX", "x");
        s = s.replace("IV", "v");
        int result = 0;
        for (int i = 0; i < s.length(); i++)
            result += convert(s.charAt(i));
        return result;
    }

    int convert(char c) {
        switch (c) {
            case 'M': return 1000;
            case 'm': return 900;
            case 'D': return 500;
            case 'd': return 400;
            case 'C': return 100;
            case 'c': return 90;
            case 'L': return 50;
            case 'l': return 40;
            case 'X': return 10;
            case 'x': return 9;
            case 'V': return 5;
            case 'v': return 4;
            case 'I': return 1;
            default: return 0;
        }
    }
}
