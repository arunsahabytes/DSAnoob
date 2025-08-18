// Last updated: 8/19/2025, 2:51:53 AM
class Solution {
    public int hIndex(int[] citations) {

        int n = citations.length;

        Arrays.sort(citations); // sorted will be 0,1,3,5,6

        for(int i = 0; i < n; i++){
                                    // n-1 here is the number of papers
            if(citations[i] >= (n-i)){
                return n-i;
            }
        }

        return 0;
    }
}