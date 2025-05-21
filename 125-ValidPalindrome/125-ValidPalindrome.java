// Last updated: 5/21/2025, 3:46:00 PM
public class Solution {
    public boolean isPalindrome(String s) {

        if(s==null) return true;

        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray())
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        String neword = sb.toString();

        if(neword.isEmpty()) return true;

        int left = 0;
        int right = neword.length() - 1;

        while(left<right){
            if(neword.charAt(left) != neword.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}