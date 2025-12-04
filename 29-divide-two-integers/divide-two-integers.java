class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend/divisor > Math.pow(2,31)-1){
            return (int)(Math.pow(2,31)-1);
        }
        if (dividend/divisor < -(Math.pow(2,31)-1)){
            if (divisor < 0){
                    return (int)(Math.pow(2,31)-1);
            } else {
                return (int)-(Math.pow(2,31));
            }
            
        }
        return dividend/divisor;
    }
}