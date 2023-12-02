package strvr.recursion;
//@Link - https://www.codingninjas.com/studio/problems/check-palindrome-recursive_624386?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//@link - https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/
public class Palindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        //int l = str.length();
        return checkStr(0,str);
    }

    public static boolean checkStr(int i, String word){

        int l = word.length();
        boolean o;
        if(i>= l/2) return true;

        if(word.charAt(i)== word.charAt(l-i-1)){
            o = checkStr(i+1, word);
        }else{
            o = false;
        }

        return o;
    }
}
