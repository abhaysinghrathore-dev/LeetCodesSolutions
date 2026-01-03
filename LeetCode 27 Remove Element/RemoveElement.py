#Solutions 1 :
class Solution(object):
    def removeElement(self, nums, val):
        while val in nums:
            nums.remove(val)

#Solutions 2 : 
class Solution:
    def removeElement(self, nums, val):
        k = 0  # Writer pointer
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        return k