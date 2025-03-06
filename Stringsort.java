import java.util.*;
public class Stringsort
{
public static void main(String args[])
{
int n,i,j;
String temp = new String();

Scanner sc = new Scanner(System.in);


System.out.println("Enter the size of the array");
n=sc.nextInt();

String s[] = new String[n];

sc.nextLine();

System.out.println("Enter the Strings");
for(i=0;i<n;i++)
{
s[i] =sc.nextLine();
}

System.out.println("Before Sorting");
for(i=0;i<n;i++)
{
System.out.println(s[i]);
}

for(i=0;i<n;i++){
for(j=0;j<n;j++){
if(s[i].compareTo(s[j]) < 0)
{
temp=s[j];
s[j]=s[i];
s[i]=temp;
}
}
}
System.out.println("After sorting");
for(i=0;i<n;i++)
{
System.out.println(s[i]);
}
}
}
