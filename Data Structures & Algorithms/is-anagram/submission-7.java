class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //String is immutable, usko sort nhi kar skte laadle!
        //Toh usko convert karo character array mein,
        //usko sort karo, aur fir compare karo, using Arrays class
        //dono .sort aur .equals functions are there in Arrays class
        
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        return Arrays.equals(s_array,t_array);
    }
}

// anagrams, if sorted will be same, therefore, converting each string to
//char array, sort, then compare using Arrays.equals(charArray1, charArray2)
// hashMap banao dono string ka apna apna, usme key mein num, aur value mein
//uska count daalo,  fir map1.equals(map2) toh true, varna false
//count array of size 26, fir iterate karte hue over the entire string, 
//if string s ka character aaya, toh corresponding index pe ++, aur string t
// ka character aaya, toh corres. index pe --
//end mein agar any value in count array is not 0, return false
//aur pura count array traverse hogya, false nhi return hua, toh return true