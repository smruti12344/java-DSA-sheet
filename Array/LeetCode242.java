//242. Valid Anagram
//ther is two way to solve this issue 
// 1. by using map
//2. by using array of size 26 for lower case letters

// 1. by using map
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
             map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
         for(int i: map.values()){
            if(i!=0){
                return false;
            }
         }
         return true;

    }
}

// 2. by using array of size 26 for lower case letters
class Solution {
    public boolean isAnagram(String s, String t) {
      //1.define array eith size of 26
      int arr[] = new int[26];
if(s.length()!=t.length()){
    return false;
}
      //run a loop over s string and put number and increse as per character by minus with character 'a'
      for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
      }
      //minus count from array based on character and check if array contain -ve return false otherwise true
       for(int i=0;i<t.length();i++){
        arr[t.charAt(i)-'a']--;
        if( arr[t.charAt(i)-'a']<0){
            return false;
        }
      }
      return true;



    }
}