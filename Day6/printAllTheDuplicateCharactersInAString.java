class Solution {
    void removeDuplicates(String str) {
        int n = str.length();
        Map<Character,Integer> map = new HashMap<>();
        
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for (Map.Entry<Character,Integer> elem : map.entrySet()) {
            if (elem.getValue() > 1)   
            System.out.println(elem.getKey() + ", count = " + elem.getValue());
        }
    }
}