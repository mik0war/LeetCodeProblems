package TribonacciNumbers;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTribonacci() throws Exception {
        Solution solution = new Solution();

        assert solution.tribonacci(4) == 4;
        assert solution.tribonacci(25) == 1389537;
        assert solution.tribonacci(34) == 334745777;
    }
}
