public class S1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int longTime = releaseTimes[0], len = releaseTimes.length;
        char key = keysPressed.charAt(0);
        for (int i = 1; i < len; i++) {
            int keyTime = releaseTimes[i] - releaseTimes[i - 1];
            if (keyTime > longTime || (keyTime == longTime && keysPressed.charAt(i) > key)) {
                key = keysPressed.charAt(i);
                longTime = keyTime;
            }
        }
        return key;
    }
}
