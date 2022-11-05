package RomanToInt;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest{
    Solution solution;

    @Before
    public void before(){
        solution = new Solution();
    }

    @Test
    public void testRomanToInt_III() throws Exception{
        assert solution.romanToInt("III") == 3;
    }

    @Test
    public void testRomanToInt_LVIII() throws Exception{
        assert solution.romanToInt("LVIII") == 58;
    }

    @Test
    public void testRomanToInt_MCMXCIV() throws Exception{
        assert solution.romanToInt("MCMXCIV") == 1994;
    }
}
