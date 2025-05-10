// Last updated: 5/10/2025, 11:56:35 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            // add() returns false if num was already present
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}