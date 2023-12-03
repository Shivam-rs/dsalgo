package strvr.basic.math;
//@Link - https://www.codingninjas.com/studio/problems/hcf-and-lcm_840448?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//@Link - https://takeuforward.org/data-structure/find-gcd-of-two-numbers/
public class GCD {
    public static int calcGCD(int n, int m){
        // Write your code here.
        while(n%m!=0){
            int remainder = n%m;
            n=m;
            m=remainder;
        }
        return m;
    }
}
