// Last updated: 8/13/2025, 10:53:25 PM
class Solution {
    public boolean isValid(String s) {
         Stack<Character> check = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                check.push(ch);
            } else {
                if (check.isEmpty()) {
                    return false;
                }
                char lastOpen = check.pop();
                if (ch == ')' && lastOpen != '(') {
                    return false;
                }
                if (ch == '}' && lastOpen != '{') {
                    return false;
                }
                if (ch == ']' && lastOpen != '[') {
                    return false;
                }
            }
        }
        return check.isEmpty();
    }
}