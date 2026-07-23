class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            String sortedVersion = sortString(str);
            map.computeIfAbsent(sortedVersion, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public String sortString(String unsortedString) {
        char[] chars = unsortedString.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
