class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        int k = 0;

        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    result[k++] = nums1[i];
                    nums2[j] = -1;  // mark used
                    break;
                }
            }
        }

        int ans[] = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = result[i];
        }

        return ans;
    }
}