// Last updated: 5/17/2025, 11:12:41 PM
public class Solution{
    int[] topKFrequent(int[] nums, int k){
    Map<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums){
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key: freqMap.keySet()){
            int freq = freqMap.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
            List<Integer> resultList = new ArrayList<>();

            for (int i = buckets.length - 1; i >= 0 && resultList.size() < k; i--) {
                if (buckets[i] != null) {
                    resultList.addAll(buckets[i]);
                }
            }
            int[] result = new int[k];
            for (int j = 0; j < k; j++) {
                result[j] = resultList.get(j);
            }
            return result;
        }
    }