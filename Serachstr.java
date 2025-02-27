import java.util.*;
class Serachstr {
public static void main(String args[])
{
int a[]= new int[20];
int i,b,n,f=0;
System.out.println("Enter the limit of array");
Scanner sc = new Scanner (System.in);
n= sc.nextInt();
System.out.println("Enter the Elements please..");
for(i=0;i<n;i++)
{
a[i]= sc.nextInt();
}

System.out.println("Enter the element you want to search");
b = sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i] == b)
{
f=1;
System.out.println("Element Found..."+b+" at "+i" postion");
break;
}
}
if(f==0)
{
System.out.println("not found");
}
}}
