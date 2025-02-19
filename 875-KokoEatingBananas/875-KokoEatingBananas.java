class Solution {
    // Helper method to calculate total hours to eat all bananas at speed k
    private int calculateHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k); // Rounds up to account for unfinished piles
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        // Binary search boundaries
        int low = 1;
        int high = piles[0];
        for (int pile : piles) {
            if (pile > high) {
                high = pile; // Find the max value manually
            }
        }

        // Binary search
        while (low < high) {
            int mid = low + (high - low) / 2; // Avoids overflow
            int totalHours = calculateHours(piles, mid);

            if (totalHours <= h) {
                high = mid; // Try a smaller eating speed
            } else {
                low = mid + 1; // Need to eat faster
            }
        }

        return low; // Minimum eating speed to eat all bananas within h hours
    }
}
