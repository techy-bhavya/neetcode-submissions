/*

s = "banana"
the counts are
a → 3
b → 1
n → 2
count array is like this
[3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, ...]
 ↑  ↑                                      ↑
 a  b                                      n

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s: strs){

            //all anagram strings will produce the exact same 
            //count array
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            //new String only works for a character array
            //and it converts the characters into a string(word)
            //this one, keeps the array as it is, just adds a
            //double inverted commas before and after
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
