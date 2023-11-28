package strvr.recursion;

public class PrintNTimes {
    public static void main(String[] args) {
        int n = 3;
        print(n);
    }

    static void print(int n){
        if(n>1) {
            System.out.print(n);
            print(n-1);
            System.out.print(n);
        }
        System.out.print("Coding Ninjas ");
        System.out.print(n);
    }
}
