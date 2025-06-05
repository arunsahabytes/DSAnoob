// Last updated: 6/5/2025, 3:53:49 PM
class Solution{

    public int maxScore(int[] cardPoints, int k){

        int n = cardPoints.length;
        int l = 0;
        int r = n - k;
        int totalSum = 0;

        for(int i = r; i<n; i++){

            totalSum += cardPoints[i];
        }
        int res = totalSum;

        while(r<n){
            totalSum += cardPoints[l];
            totalSum -= cardPoints[r];
            res = Math.max(res, totalSum);
            l++;
            r++;
        }
        return res;
    }
}