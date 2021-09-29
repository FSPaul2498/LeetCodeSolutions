public class S517 {
    public int findMinMoves(int[] machines) {
        int n = machines.length, sum = 0;
        for (int machine : machines) sum += machine;
        if (sum % n != 0) return -1;
        int target = sum / n, steps = 0, balance = 0;
        for (int machine : machines) {
            int nBalance = machine + balance - target;
            if (balance < 0 && nBalance > 0) {
                if (Math.abs(nBalance - balance) > steps) steps = Math.abs(nBalance - balance);
            } else {
                if (Math.abs(nBalance) > steps) steps = Math.abs(nBalance);
            }
            balance = nBalance;
        }
        return steps;
    }
}
