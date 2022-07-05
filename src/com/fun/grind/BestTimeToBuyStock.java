package com.fun.grind;

public class BestTimeToBuyStock {

    public static void main(String[] args) {

        var prices = new int[]{7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    protected static int maxProfit(int[] stockPrices) {
        var profit = 0;

        int minimumValue = Integer.MAX_VALUE;

        for (int i=0; i<stockPrices.length; i++) {
            //Find the minimum value, retaining the minimum value in the array
            if (stockPrices[i] < minimumValue) {
                minimumValue = stockPrices[i];
            }
            //Check if the difference between the current value and minimum value is higher than the profit
            //If it is, set the profit to this value
            else if (stockPrices[i] - minimumValue > profit) {
                profit = stockPrices[i] - minimumValue;
            }
        }
        return profit;
    }
}
