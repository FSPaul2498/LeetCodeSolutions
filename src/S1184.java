public class S1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forwardStop = start, backwardStop = start;
        int forwardDistSum = 0, backwardDistSum = 0;
        int l = distance.length;
        while (forwardStop != destination && backwardStop != destination) {
            int forwardNext = distance[forwardStop % l];
            int backwardNext = distance[(backwardStop - 1 + l) % l];
            if (forwardDistSum + forwardNext < backwardDistSum + backwardNext) {
                forwardDistSum += forwardNext;
                forwardStop = (forwardStop + 1) % l;
            } else {
                backwardDistSum += backwardNext;
                backwardStop = (backwardStop - 1 + l) % l;
            }
        }
        return forwardStop == destination ? forwardDistSum : backwardDistSum;
    }
}
