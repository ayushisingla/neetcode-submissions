class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        HashSet<Character> set = new HashSet<Character>();
        int longest = 0;
        int left = 0;
        
        int right = 1;
        
        set.add(s.charAt(left));
        while(right<s.length()){
            System.out.println("left: " + left + " right:" + right);
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            System.out.println("diff: " + set.size());
            longest = Math.max(longest, set.size());
            right++;
            System.out.println("SET: " + set);
        }
        return longest;
    }
}
