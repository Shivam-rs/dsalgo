package strvr.basicmath;

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
