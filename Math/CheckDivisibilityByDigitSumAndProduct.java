//LeetCode-3622 : Check Divisibility by Digit Sum and Product
//  Approach:
//Calculate the sum and product of all the digits of n
//Now, check whether n(which is stored in temp) is divisible by (sum + product)
//
//Time-complexity : O(log n)
//Space-Complexity : O(1)
class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0,pro=1;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(temp%(sum+pro)==0){
            return true;
        }
        else{
            return false;
        }
    }
}
