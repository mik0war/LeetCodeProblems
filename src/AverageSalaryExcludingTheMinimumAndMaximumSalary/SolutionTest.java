package AverageSalaryExcludingTheMinimumAndMaximumSalary;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testAverage() throws Exception{
        Solution solution = new Solution();

        assert solution.average(new int[]{2000, 3000, 4000, 1000}) == 2500.0;
    }
}
