
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        solve("",list,0,0,n);

        return list;
    }


    void solve(String s,List<String> list,int open,int close,int n){
         if(open == n && close == n){
        list.add(s);
        return;
    }

    if(open < n){
        solve(s+"(",list,open+1,close,n);
    }

    if(close < n && close < open){
        solve(s+")",list,open,close+1,n);
    }
    }
   

}