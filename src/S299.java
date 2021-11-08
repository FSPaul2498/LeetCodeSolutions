public class S299 {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0, len = secret.length();
        int[] mapS = new int[10];
        int[] mapG = new int[10];
        for (int i = 0; i < len; i++) {
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                mapS[secret.charAt(i) - '0']++;
                mapG[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++)
            cows += Math.min(mapS[i], mapG[i]);
        return bulls + "A" + cows + "B";
    }
}
