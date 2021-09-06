public class S38 {
    public String countAndSay(int n) {
        String result = "1";
        while (n > 1) {
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            char letter = result.charAt(0);
            for (char ch : result.toCharArray()) {
                if (ch == letter) counter++;
                else {
                    sb.append(counter);
                    sb.append(letter);
                    counter = 1;
                    letter = ch;
                }
            }
            sb.append(counter);
            sb.append(letter);
            result = sb.toString();
            n--;
        }
        return result;
    }
}
