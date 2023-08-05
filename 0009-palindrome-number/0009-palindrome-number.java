class Solution {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        StringBuffer reverseBufferX = new StringBuffer(strX);
        String reverseX = reverseBufferX.reverse().toString();
        
        if (strX.equals(reverseX)){
            return true;
        }
        return false;
    }
}