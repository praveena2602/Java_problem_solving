import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
  public static void main(String[] args) {
        int i,count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
        if(a[i]==0){
            count++;
        }
        }
        System.out.println("zc = "+count);
        System.out.print("oc = "+(n-count));
        }
        }
