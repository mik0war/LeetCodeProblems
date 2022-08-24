package LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

public class SolutionTest { 

@Test
public void testLengthOfLongestSubstring() throws Exception {
    Solution solution = new Solution();

    assert solution.lengthOfLongestSubstring("abcabcbb") == 3;
    assert solution.lengthOfLongestSubstring("bbbbb") == 1;
    assert solution.lengthOfLongestSubstring("pwwkew") == 3;
    assert solution.lengthOfLongestSubstring("aab") == 2;
    assert solution.lengthOfLongestSubstring("aabaabwbb") == 3;
} 


} 
