package CountOddNumbersinanIntervalRange;

import org.junit.Test;

public class SolutionTest { 

@Test
public void testCountOdds() throws Exception {
    Solution solution = new Solution();
    assert solution.countOdds(3, 7) == 3;
    assert solution.countOdds(0, 10) == 5;
    assert solution.countOdds(1, 9) == 5;
} 


} 
