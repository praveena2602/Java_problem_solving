import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int flag=0,count=1;
	    int i=1;
	    while(i>0){
	        if(i*i==n){
	            flag=1;
	            break;
	        }
	        
	        i++;
	        
	    }
	    	       
	    if(flag==1){
		System.out.println("Success");
	}
	else{
	    System.out.print("Fail");
	}
}
}
