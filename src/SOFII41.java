class MovingAverage {
    int size, cnt;
    double sum;
    int[] arr;

    public MovingAverage(int size) {
        this.size = size;
        arr = new int[size];
    }

    public double next(int val) {
        sum += val - arr[cnt % size];
        arr[cnt % size] = val;
        cnt++;
        return sum / Math.min(size, cnt);
    }
}