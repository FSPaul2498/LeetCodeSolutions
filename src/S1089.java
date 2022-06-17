public class S1089 {
    public void duplicateZeros(int[] arr) {
        for (int i = 0, j = 0; j < arr.length; i++, j++) {
            if ((arr[i] & 0xF) != 0) arr[j] |= (arr[i] & 0xF) << 4;
            else j++;
        }
        for (int i = 0; i < arr.length; i++) arr[i] >>= 4;
    }
}
