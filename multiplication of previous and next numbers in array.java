import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
    }
        System.out.print(a[0]*a[1]+" ");
        for(i=1;i<n-1;i++){
        int k=a[i-1]*a[i+1];
        System.out.print(k+" ");
        }
        System.out.println(a[n-1]*a[n-2]);
}}
