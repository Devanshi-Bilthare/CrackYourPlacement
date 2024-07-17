class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];

        int len = Math.min(first.length(),last.length());
        for(int i =0;i < len;i++){
            if(first.charAt(i) != last.charAt(i)) return ans.toString();

            ans.append(first.charAt(i));
        } 

        return "";
    }
}