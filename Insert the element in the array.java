import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int data=sc.nextInt();
         int pos=sc.nextInt();
        for(int i=n;i>pos-1;i--){
            arr[i]=arr[i-1];
                
            }
        arr[pos-1]=data;
        for( int i=0;i<n+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
