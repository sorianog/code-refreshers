import java.util.HashMap;

public class FrequentFinder {

    // Determine the Time/Space complexity in Big-O Notation.
    public static int mostFrequent(int[] array) {
        int maxItem = Integer.MAX_VALUE;
        int maxCount = 0;

        HashMap<Integer, Integer> freqCount = new HashMap<Integer, Integer>();

        for (int item : array) {
            if (!freqCount.containsKey(item)) {
                freqCount.put(item, 1);
            } else {
                int newCount = freqCount.get(item) + 1;
                freqCount.put(item, newCount);
            }

            if (freqCount.get(item) > maxCount) {
                maxCount = freqCount.get(item);
                maxItem = item;
            }
        }

        return maxItem;
    }
}