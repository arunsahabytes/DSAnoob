// Last updated: 8/17/2025, 3:16:16 AM
class Solution {
    public int maximum69Number (int num) {

     String s = String.valueOf(num);

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if (c[i] == '6') {
                c[i] = '9';
                break;
            }
        }
        String s1 = String.copyValueOf(c);

        int i2 = Integer.parseInt(s1);
        return i2;
    }
}