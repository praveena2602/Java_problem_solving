import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int rem=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        while(n>0){
            int c=n%10;
            rem=rem*10+c;
            n=n/10;
        }
        if(copy==rem){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
