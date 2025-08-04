import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int row=0;row<=a;row++){
            for(int col=0;col<row;col++){
                    System.out.print(" ");
                }
            for(int i=1;i<=(a*2)-(2*row+1);i++){
                    System.out.print("*");
                }
            System.out.println();
        }
        }
    }
