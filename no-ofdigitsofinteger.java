import java.util.*;
import java.lang.*;
import java.io.*;
 class Ideone
{
public static void main (String[] args) throws java.lang.Exception
{
int n=234,r=0,i=0;
System.out.println("enter your no "+n);
while(n!=0)
{
r=n%10;
i++;
n=n/10;
}
System.out.println("no of digits of an integer are "+i);
}
}