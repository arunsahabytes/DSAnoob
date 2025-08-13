// Last updated: 8/13/2025, 9:44:23 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    HashSet<Integer> seen = new HashSet<>();

    for(int num: nums){
        if(seen.contains(num)){
                return true;
            }
            else{
            seen.add(num);
        }
    }
    return false;
    }
}