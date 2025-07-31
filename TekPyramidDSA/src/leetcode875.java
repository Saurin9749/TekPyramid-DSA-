import java.util.*;

public class leetcode875 {

    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = Arrays.stream(piles).max().getAsInt();

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long totalHours = helper(piles, mid);

            if (totalHours <= h) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    private long helper(int[] piles, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1L) / k; // ceil division
        }
        return totalHours;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of piles
        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();
        int[] piles = new int[n];

        // Input the piles
        System.out.print("Enter the banana piles: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        // Input total hours available
        System.out.print("Enter total hours (h): ");
        int h = sc.nextInt();

        // Calculate minimum eating speed
        Solution sol = new Solution();
        int result = sol.minEatingSpeed(piles, h);

        System.out.println
