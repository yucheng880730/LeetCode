package Stock_Profit;

public class StockProfit {
    public int maxProfit(int[] prices) {

        int min = 1000000;
        int max = 0;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < min) {
                min = prices[i];
            }

            int cur = prices[i] - min;

            if(cur > max) {
                max = cur;
            }
        }
        System.out.println(max);
        return max;

//  this version time exceeded limit
//
//        int min = 0;
//        int max = 0;
//
//        for(int i = 0; i < prices.length; i++) {
//            min = prices[i];
//            for(int j = i; j < prices.length; j++) {
//                if(prices[j] - min > max) {
//                    max = prices[j] - min;
//                }
//            }
//        }
//        System.out.println(max);
//        return max;
    }
}
