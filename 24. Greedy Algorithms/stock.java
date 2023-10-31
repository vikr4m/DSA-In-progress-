public class stock {
    static int maxprofit(int[] prices, int n){
        int buy = prices[0], profit= 0;
        for(int i = 1;i < n; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else if(prices[i]-buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};    
        int n = prices.length;
        int profit = maxprofit(prices,n);
        System.out.println(profit);
    }
}
