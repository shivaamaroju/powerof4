class Solution {
    public boolean isPowerOfFour(int n) {
        double k=Math.log(n)/Math.log(4);
        return k-(int)k==0;
    }
}
