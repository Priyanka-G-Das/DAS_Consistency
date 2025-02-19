class Solution {
    public boolean isPalindrome(String s) {
        // using two pointer approach
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
     int left=0;
     int right=s.length()-1;
     while(left<right)
     {
        if(s.charAt(left)==s.charAt(right))
        {
            left++;
            right--;
        }else
        return false;
     }
     return true;
    }
}