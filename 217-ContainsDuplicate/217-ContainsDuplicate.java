// Last updated: 5/11/2025, 8:44:15 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    Set<Integer> seen = new HashSet<Integer>();
    for(int num: nums){
        if(!seen.add(num)){
            return true;
        }
    }
    return false;
}
}