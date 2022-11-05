package LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        String oddPalindrome = longPalindrome(s, 2);
        String evenPalindrome = longPalindrome(s, 1);
        return (oddPalindrome.length() > evenPalindrome.length()) ? oddPalindrome : evenPalindrome;
    }

    private String longPalindrome(String s, int nextIndex){
        char[] letters = s.toCharArray();

        String result = null;

        for (int index = 0; index < letters.length-nextIndex; index++) {
            if(letters[index] == letters[index+nextIndex]) {
                int dif = 0;


                while(index+nextIndex+dif < letters.length && index-dif >= 0 &&
                        letters[index-dif] == letters[index+nextIndex+dif]){
                    dif += 1;
                }
                String substring = s.substring(index-dif+1, index+nextIndex+dif);
                if (result != null)
                    result = substring.length() > result.length() ? substring : result;
                else
                    result = substring;
            }

        }

        return result != null ? result : s.substring(0, 1);
    }
}
