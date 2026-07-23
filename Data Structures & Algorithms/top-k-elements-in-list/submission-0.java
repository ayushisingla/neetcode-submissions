class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int value: map.keySet()){
            int freq = map.get(value);
            
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(value);
        }

        int[] res = new int[k];
        int index = 0;
        for(int i=buckets.length-1; i>=0; i--) {
            if(buckets[i] != null) {
                for(int j = 0; j<buckets[i].size(); j++){
                    res[index] = buckets[i].get(j);
                    index++;
                    if(index>=k) return res;
                }
            }
        }

        return res;
    }
}
