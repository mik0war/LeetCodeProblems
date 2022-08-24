package FibonacciNumbers;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testFib() throws Exception {
        Solution solution = new Solution();

        assert solution.fib(2) == 1;
        assert solution.fib(3) == 2;
        assert solution.fib(4) == 3;
    }
}
