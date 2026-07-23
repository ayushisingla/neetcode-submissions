class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            String key = createKey(str);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public String createKey(String str) {
        // char[] chars = str.toCharArray();
        // Arrays.sort(chars);
        // return new String(chars);

        int[] count = new int[26];
        for(char c: str.toCharArray() ){
            count[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int val: count) {
            sb.append(val).append('#');
        }
        return sb.toString();
    }
}
