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
