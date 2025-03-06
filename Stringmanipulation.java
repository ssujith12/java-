import java.util.*;
public class Stringmanipulation
{
public static void main(String args[])
{
String a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String!!");
a = sc.nextLine();

System.out.println("Performing String operations");
String z = a.toUpperCase();
System.out.println("Uppercase letter is :"+z);
System.out.println("Lowercase letter is :"+a.toLowerCase());
System.out.println("Length of the String is :"+a.length());
System.out.println("Substring is :"+a.substring(0,4));
System.out.println("hashcode of the string is :"+a.hashCode());
}
}
