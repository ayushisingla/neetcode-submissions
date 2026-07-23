class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        int prefixPointer = 1, suffixPointer = 1;
        prefix[0] =1;
        suffix[nums.length-1] = 1;

        for(int i=1, j=nums.length-2; i<nums.length&&j>=0; i++, j--){
            prefixPointer *= nums[i-1]; 
            prefix[i] = prefixPointer;
            suffixPointer *= nums[j+1]; 
            suffix[j] = suffixPointer;
        }

        for(int i=0; i<prefix.length; i++) {
            prefix[i] *= suffix[i]; 
        }
        return prefix;
    }
}  
