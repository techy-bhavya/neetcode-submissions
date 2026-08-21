class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //hashset wont work dear, 
        //eg s = "aab", t="abb"
        //these are not anagrams, but
        //hashset wale logic se true aa jaega
        HashMap<Character, Integer> count_s = new HashMap<>();
        HashMap<Character, Integer> count_t = new HashMap<>();
        for(int i=0;i<s.length();i++){
            count_s.put(s.charAt(i),count_s.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            count_t.put(t.charAt(i),count_t.getOrDefault(t.charAt(i),0)+1);
        }
        // this is the way to check if two hashmaps are equal
        //arrays k case mein we do Arrays.equals(arr1,arr2)
        //here we do map1.equals(map2)
        return count_s.equals(count_t);
    }
}
