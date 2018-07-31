
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,c=0,a,temp;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    c=c+(a*a*a);  
    n=n/10;
    }  
    if(temp==c)  
    System.out.println("yes");   
    else  
        System.out.println("no");   
	}
}
