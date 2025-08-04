import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1,ws=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i%2)!=0){
                   System.out.print(val);
                    val+=2;
                }
            else{
                System.out.print(ws);
                ws+=2;
            }
            }
            val=1;
            ws=2;
            System.out.println();
        }
    }
}
