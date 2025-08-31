// Last updated: 8/31/2025, 7:55:11 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        Set<Integer> check = new HashSet<>();

        for(int i=0; i<friends.length; i++){
            check.add(friends[i]);
        }
        int result[] = new int[friends.length];
        int idx = 0;
        for(int i = 0; i<order.length; i++){
            if(check.contains(order[i])){
                result[idx] = order[i];
                idx++;
                
            }
        }
         return result;
    }
}