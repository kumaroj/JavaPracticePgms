package Questions.Medium.Array;

public class StockBuyAndSell {
    public static void main(String[] args) {

        int []prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int  maxProfit(int[] prices) {
        int maxprofit = 0;
        int profit = 0;

        int buyprice  = prices[0];
        for (int i = 1; i<prices.length; i++){
            if (buyprice<prices[i]){
                profit = prices[i] - buyprice;
                maxprofit = Math.max(profit , maxprofit);

            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }


}
