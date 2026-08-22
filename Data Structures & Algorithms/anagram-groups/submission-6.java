//map is in this form
//"aet" → ["eat", "tea", "ate"]
//"ant" → ["tan", "nat"]
//"abt" → ["bat"]

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            //yaha pe ekbaar pehli baar jab naya sorted string
            //aaya, tab add karna h as key, and new empty arraylist
            //uske baad jab bhi aaya, toh uske correspond string, ie
            //anagram ko add karna h, in the arraylist of the sorted 
            //string, finally sara strings of the array process
            //hone k baad, map ka values, mein sara anagrams
            //ek apna apna arraylist mein h, 
            // finally, un sabko, ek common arraylist mein daalke,
            // return kardo
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
        //new ArrayList<>(map.keySet()); for keys
        //new ArrayList<>(map.entrySet()); for entries

//map.entrySet() contains
// [
  //("aet", ["eat", "tea", "ate"]),
  //("ant", ["tan", "nat"]),
  //("abt", ["bat"])
// }
//for accessing key and value from entry
//for (Map.Entry<String, List<String>> entry : map.entrySet()) {
    //System.out.println(entry.getKey());
    //System.out.println(entry.getValue());
/*
aet
[eat, tea, ate]

ant
[tan, nat]

abt
[bat]
*/
    }

}

/*
map.keySet()
    ↓
["aet", "ant", "abt"]


map.values()
    ↓
[["eat","tea","ate"], ["tan","nat"], ["bat"]]


map.entrySet()
    ↓
[
  ("aet", ["eat","tea","ate"]),
  ("ant", ["tan","nat"]),
  ("abt", ["bat"])
]
*/

//Solution 1 mein for(String s:strs), s ko charArray banao, charArray ko sort
//karo, fir again new String(charArray), fir map.putIfAbsent
//(sorted, new ArrayList<>()), fir, map.get(sorted).add(s);
//last mein return new ArrayList<>(map.values());

//Solution 2 mein for(String s:strs), count array of size 26 banao, for char
//c in s, count[c-'a']++,String key = Arrays.toString(count) fir map.putIfAbsent
//(key, new ArrayList<>()), fir, map.get(key).add(s);
//last mein return new ArrayList<>(map.values());
//works on the logic that every set of anagrams will have same count array

