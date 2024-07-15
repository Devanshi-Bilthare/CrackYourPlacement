// tc - O(M+N)
// sc - O(M
)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for(int i =0;i < m;i++){
            temp[i] = nums1[i];
        }

        int i =0;
        int j =0;
        int k =0;
        while(i < m && j < n){
            if(temp[i] < nums2[j]){
                nums1[k] = temp[i];
                i++;
            }else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            nums1[k] = temp[i];
            i++;
            k++;
        }

        while(j < n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }

    }
}