class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int n = s.length();
        StringBuilder result = new StringBuilder();
        
        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            if (i == n) break;

            int j = i + 1;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }

            String word = s.substring(i, j);
            if (result.length() == 0) {
                result.append(word);
            } else {
                result.insert(0, word + " ");
            }
            
            i = j + 1;
        }

        return result.toString();
    }
}
