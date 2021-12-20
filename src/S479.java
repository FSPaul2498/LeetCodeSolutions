import java.util.Arrays;

public class S479 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0, heater = 0, len = heaters.length;
        for (int house : houses) {
            while (heater + 1 < len) {
                if (Math.abs(house - heaters[heater + 1]) <= Math.abs(house - heaters[heater])) {
                    heater++;
                } else break;
            }
            radius = Math.max(radius, Math.abs(house - heaters[heater]));
        }
        return radius;
    }
}
