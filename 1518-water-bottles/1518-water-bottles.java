class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int total = numBottles;
        
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remainder = numBottles % numExchange;
            
            total += newBottles;
            numBottles = newBottles + remainder;
        }
        
        return total;
    }
}