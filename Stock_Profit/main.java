package Stock_Profit;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] price = {1, 7, 9, 5, 4};
        StockProfit stockProfit = new StockProfit();
        stockProfit.maxProfit(price);
    }
}
