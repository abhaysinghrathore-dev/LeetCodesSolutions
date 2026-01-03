class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        res = 1  # 1️⃣ Result/Writer pointer. Index 1 se start karenge kyunki index 0 fix hai.
        
        # 2️⃣ Loop start hota hai index 1 se (compare karne ke liye)
        for i in range(1, len(nums)):
            
            # 3️⃣ Logic: Kya current number (i) apne pichle number (i-1) se alag hai?
            if nums[i] != nums[i - 1]:
                nums[res] = nums[i] # 4️⃣ Agar alag hai, toh usse 'res' position pe likh do
                res += 1 # 5️⃣ Writer pointer ko aage badhao
                
        return res # 6️⃣ 'res' already count maintain kar raha hai