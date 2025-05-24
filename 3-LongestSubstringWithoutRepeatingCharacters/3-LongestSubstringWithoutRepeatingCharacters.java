// Last updated: 5/24/2025, 6:05:53 PM
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int n = s.length();
        int start = 0;
        int end = 0;
        int maxLength = 0;

        Set<Character> windowChars = new HashSet<>();

        while (end < n) {
            char charAtEnd = s.charAt(end);

            if (!windowChars.contains(charAtEnd)) {
                windowChars.add(charAtEnd);
                end++;
                maxLength = Math.max(maxLength, windowChars.size());
            } else {
                char charAtStart = s.charAt(start);
                windowChars.remove(charAtStart);
                start++;
            }
        }

        return maxLength;
    }
}
