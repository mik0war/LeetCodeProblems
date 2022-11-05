package LongestPalindromicSubstring;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class SolutionTest {
    Solution solution;

    @Before
    public void before(){
        solution = new Solution();
    }

    @Test
    public void testLongestPalindrome(){
        assert Objects.equals(solution.longestPalindrome("aaaa"), "aaaa");
        assert Objects.equals(solution.longestPalindrome("absaasbasdf"), "absaasba");
        assert Objects.equals(solution.longestPalindrome("aaa"), "aaa");
    }
}
