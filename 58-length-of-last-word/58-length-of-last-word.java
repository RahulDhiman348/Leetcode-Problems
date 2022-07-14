class Solution {
    public int lengthOfLastWord(String s) {
        int pointer = s.length();
        int length = 0;
        while(pointer-->0){
            
            if(s.charAt(pointer) != ' '){
                length++;
            }
            else if(length>0)
                return length;
        }
        return length;
    }
}