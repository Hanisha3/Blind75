package blind75LeetCode;

public class BestTimetoBuyAndSellStock {
	public static void maxprofit(int profit[]) {
		int buy = Integer.MAX_VALUE;
		int max_profit = Integer.MIN_VALUE;
		for(int p : profit) {
			buy = Math.min(p, buy);
			max_profit = Math.max(max_profit, p-buy);
	}
		System.out.print(max_profit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		maxprofit(prices);
		}
	}