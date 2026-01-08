class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        max_profit = 0
        
        for i in range(1, len(prices)):
            buy = min(buy, prices[i])
            max_profit = max(max_profit, prices[i] - buy)

        return max_profit