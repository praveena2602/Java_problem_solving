import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int row=1;row<=a*2-1;row++){
            for(int col=1;col<=a*2-1;col++){
                if(row==col||row+col==a*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        
          System.out.println();  
        }
    }
}
