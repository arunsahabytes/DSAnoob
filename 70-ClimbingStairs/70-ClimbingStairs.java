// Last updated: 5/12/2025, 4:50:09 PM
class Solution {
    public int climbStairs(int n) {
        
        int a = 1;
        int b = 2;

        if(n<=2) return n;

        for(int i=3; i<=n; i++){
            int c = a + b;

            a = b;
            b = c;
        }
        return b;
    }
}