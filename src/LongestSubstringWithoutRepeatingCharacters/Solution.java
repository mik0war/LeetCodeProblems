package LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder substring = new StringBuilder();
        String max_string = "";

        for (char letter : s.toCharArray()) {
            int position = substring.lastIndexOf(Character.toString(letter));

            if (position != -1)
                substring.delete(0, position+1);

            substring.append(letter);

            if(substring.length() > max_string.length())
                max_string = substring.toString();

        }
        return max_string.length();
    }
}
