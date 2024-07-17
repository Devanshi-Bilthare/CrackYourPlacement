class Solution {
    public boolean validPalindrome(String s) {
        int st = 0;
        int end = s.length()-1;

        while(st <= end){
            if(s.charAt(st) == s.charAt(end)){
                st++;
                end--;
            }else{
               return helper(s,st+1,end) || helper(s,st,end-1);
            }

        }

        return true;
    }

     boolean helper(String s, int st, int end){
            while(st <= end){
                if(s.charAt(st) == s.charAt(end)){
                    st++;
                    end--;
                }else{
                    return false;
                }
            }

            return true;
        }
}