//Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int bb =prices[0];
        for(int i : prices){
            if(i>bb){
                mp = Math.max(mp,i-bb);
            }
           bb = Math.min(bb,i);
        }
        return mp;
    }
}