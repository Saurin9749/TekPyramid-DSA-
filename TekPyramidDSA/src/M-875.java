class Solution {
    private long helper(int[] piles, int k) {
        long totalHours = 0;  // use long to prevent overflow
        for (int pile : piles) {
            totalHours += (pile + k - 1L) / k; // equivalent to ceil(pile / k)
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = Arrays.stream(piles).max().getAsInt();

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long totalHours = helper(piles, mid);  // changed to long

            if (totalHours <= h) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }


}

public class M-875{
    public static void main(String [] args){

    }
}