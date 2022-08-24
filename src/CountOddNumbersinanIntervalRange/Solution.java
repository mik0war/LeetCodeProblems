package CountOddNumbersinanIntervalRange;

public class Solution {
    public int countOdds(int low, int high) {
        return ((high%2!=0?high:high-1) - (low%2!=0?low:low+1)) / 2 + 1;
    }
}
