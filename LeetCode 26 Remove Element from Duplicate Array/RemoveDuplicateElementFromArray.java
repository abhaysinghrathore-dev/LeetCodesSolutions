class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // 1️⃣ Slow Pointer (Writer) - Unique elements ka track rakhta hai

        // 2️⃣ Fast Pointer (Reader) - Array ko scan karta hai start se end tak
        for (int j = 1; j < nums.length; j++) {
            
            // 3️⃣ Logic: Agar Reader (j) ko jo number mila, wo Writer (i) ke number se alag hai?
            if (nums[j] != nums[i]) {
                i++; // 4️⃣ Writer ko agli khali seat par bhejo
                nums[i] = nums[j]; // 5️⃣ Wahan par naya unique number copy karo
            }
        }
        
        // 6️⃣ Kyunki index 0 se start hota hai, length 'i + 1' hogi
        return i + 1;
    }
}