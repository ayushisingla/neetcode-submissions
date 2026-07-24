class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        HashSet<Character> set = new HashSet<Character>();
        int longest = 0;
        int left = 0;
        int right = 0;
        
        while(right<s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            longest = Math.max(longest, set.size());
            right++;
        }
        return longest;
    }
}
