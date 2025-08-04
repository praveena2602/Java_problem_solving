import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        while(n>0){
            int c=n%10;
             rev=rev*10+c;
            n=n/10;
            
        }
            System.out.print(rev);
    
    }
}
