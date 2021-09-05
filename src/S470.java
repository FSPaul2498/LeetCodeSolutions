public class S470 {
    public int rand10() {
        int a = 7, b = 7;
        while (a > 5) a = rand7();
        while (b > 6) b = rand7();
        return (b & 1) == 0 ? a : a + 5;
    }

    int rand7() {
        return (int) (Math.random() * 7 + 1);
    }
}
