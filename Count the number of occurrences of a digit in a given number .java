import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         int cout=0,c;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        while(n>0){
            c=n%10;
            if(c==b){
                cout++;
            }
            n=n/10;
        }
        System.out.println(cout);
    }
}
