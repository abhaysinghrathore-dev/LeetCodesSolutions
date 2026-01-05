class Solution {
    public void rotate(int[] nums, int k) {
        int numslen = nums.length;
        k %= numslen;

        reverse(nums, 0, numslen - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, numslen - 1);
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}