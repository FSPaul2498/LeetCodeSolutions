class TopVotedCandidate {
    int[] times, lead;
    int pLen;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;
        pLen = persons.length;
        lead = new int[pLen];
        int[] count = new int[5005];
        for (int i = 0, max = -1; i < pLen; i++) {
            count[persons[i]]++;
            if (count[persons[i]] >= max) {
                lead[i] = persons[i];
                max = count[persons[i]];
            } else {
                lead[i] = lead[i - 1];
            }
        }
    }

    public int q(int t) {
        if (t >= times[pLen - 1]) return lead[pLen - 1];
        int l = 0, r = pLen - 1;
        while (l < r - 1) {
            int mid = l + (r - l) / 2;
            if (times[mid] > t) r = mid - 1;
            else l = mid;
        }
        return times[r] <= t ? lead[r] : lead[l];
    }
}
