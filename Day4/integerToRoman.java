class Solution {
    public String intToRoman(int num) {
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ans = "";
        int idx = 0;

        while(num > 0){ 
                int t = num /val[idx];
                num = num % val[idx];
                ans += str[idx].repeat(t);
            idx++;
        }
        
        return ans.toString();
    }
}