public class S273 {
    public String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();
        if (num / 1000000000 > 0)
            sb.append(intToEng(num / 1000000000)).append(" Billion ");
        if (num / 1000000 % 1000 > 0)
            sb.append(intToEng(num / 1000000 % 1000)).append(" Million ");
        if (num / 1000 % 1000 > 0)
            sb.append(intToEng(num / 1000 % 1000)).append(" Thousand ");
        if (num % 1000 > 0)
            sb.append(intToEng(num % 1000));
        if (num == 0)
            sb.append("Zero");
        return sb.toString().trim();
    }

    String intToEng(int num) {
        StringBuilder sb = new StringBuilder();
        if (num / 100 > 0)
            sb.append(intToEng(num / 100)).append(" Hundred ");
        if (num % 100 >= 20) {
            String[] ten = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            sb.append(ten[num / 10 % 10]).append(" ");
        }
        if (num % 100 < 20 || num % 10 != 0) {
            String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            if (num % 100 < 20) sb.append(one[num % 100]);
            else sb.append(one[num % 10]);
        }
        return sb.toString().trim();
    }
}
