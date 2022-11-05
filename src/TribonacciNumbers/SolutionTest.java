package TribonacciNumbers;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;

    @Before
    public void beforeAll(){
        solution = new Solution();
    }

    @Test
    public void testTribonacci_4() throws Exception {
        assert solution.tribonacci(4) == 4;
    }

    @Test
    public void testTribonacci_25() throws Exception {
        assert solution.tribonacci(25) == 1389537;
    }

    @Test
    public void testTribonacci_34() throws Exception {
        assert solution.tribonacci(34) == 334745777;
    }

}
