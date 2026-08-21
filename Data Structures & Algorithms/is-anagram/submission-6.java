class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        //jaise hashmap mein count of characters store kiya tha
        //similarly, count array of size 26, mein string s mein
        //character aaya toh uska count badha denge, 
        //aur t mein aaya, toh kam kar denge, 
        //therefore, after processing of entire string, 
        //no element in count array should be anything other than 0
        //for the strings to be anagrams!

        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int val:count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
