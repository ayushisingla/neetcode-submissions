class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            String sorted = sortedString(str);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList(map.values());

    }
    public String sortedString (String unsortedString) {
        int len = unsortedString.length();
        char[] array = unsortedString.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
