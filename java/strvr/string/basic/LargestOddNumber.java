package strvr.string.basic;

public class LargestOddNumber {
    public static void main(String[] args) {
        System.out.println("Largest Odd number is " + largestOddNumber("35427799666"));
    }
    public static String largestOddNumber(String num) {
        int n = num.length();

        for(int i =n-1; i>=0; i--){
            char ch =  num.charAt(i);
            int val = Character.getNumericValue(ch);
            if(val %2 == 1) return num.substring(0, i+1);
        }

        return "";
    }
}
