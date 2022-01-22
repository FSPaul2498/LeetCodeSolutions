public class S1332 {
    public int removePalindromeSub(String s) {
        return new StringBuilder(s).reverse().toString().equals(s) ? 1 : 2;
    }
}
