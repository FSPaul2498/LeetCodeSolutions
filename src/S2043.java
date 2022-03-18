class Bank {
    long[] balance;
    int n;

    public Bank(long[] balance) {
        this.balance = balance;
        n = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        account1--;
        account2--;
        if (account1 < 0 || account1 >= n || balance[account1] < money) return false;
        if (account2 < 0 || account2 >= n) return false;
        balance[account1] -= money;
        balance[account2] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        account--;
        if (account < 0 || account >= n) return false;
        balance[account] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        account--;
        if (account < 0 || account >= n || balance[account] < money) return false;
        balance[account] -= money;
        return true;
    }
}

