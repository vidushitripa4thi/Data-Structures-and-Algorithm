
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int n : count) {
                key.append('#').append(n);
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>())
               .add(s);
        }

        return new ArrayList<>(map.values());
    }
}

