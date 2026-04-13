class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums2.length;
        int[] next = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            next[i] = -1; 
            
            for (int j = i + 1; j < n; j++) {
                if (nums2[j] > nums2[i]) {
                    next[i] = nums2[j];
                    break;
                }
            }
        }
        
       
        int[] ans = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = next[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}