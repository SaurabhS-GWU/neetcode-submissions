class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(s.length() != t.length()){
            return false;
        }else{
           return Arrays.equals(charArray1, charArray2);
        }

    }
}
