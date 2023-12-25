import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int resultMaxProfit = BuySellStock.maxProfit(arr);
        System.out.println(resultMaxProfit);
    }
    public static int maxProfit(int[] prices) {

        // we need to find the maximum & minimum from the day you see the minimum rate then you buy & sell at the higher rate 
        // so we need to calculate the max from minimum index & if we get the low from min index then sell the stock & return the difference of buy & sell otherwise return 0 
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        if ((1 <= prices.length && prices.length <= 10)){
        for(int i = 0; i<prices.length; i++){
            if(0 <= prices[i] &&  prices[i] <= 10){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else if (prices[i]-minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        }
        }
        return maxProfit;
    }
}
