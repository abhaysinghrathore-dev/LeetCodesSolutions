class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // 1️⃣ nums1 ke valid last element par pointer
        int j = n - 1;          // 2️⃣ nums2 ke last element par pointer
        int k = m + n - 1;      // 3️⃣ nums1 ka final last index
        
        while (j >= 0) {        // 4️⃣ nums2 khatam hone tak chalega
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];    // nums1 ka element bada hai
                i--;
            } else {
                nums1[k] = nums2[j];    // nums2 ka element bada hai (ya nums1 khatam)
                j--;
            }
            k--;
        }
    }
}
