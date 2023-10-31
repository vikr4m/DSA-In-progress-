public class stockprofit {
    public static int buyandsellstock(int prices[]){
        int bp = Integer.MAX_VALUE;
        int maxp = 0;

        for (int i = 0; i < prices.length; i++) {
            if(bp < prices[i]){ //profit
                int profit = prices[i] - bp;    //today's profit
                maxp = Math.max(maxp, profit);
            } 
            else{
                bp = prices[i];
            }
        }

        return maxp;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyandsellstock(prices));
    }
}
