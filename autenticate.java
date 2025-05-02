import java.util.*;
class userException extends Exception {
userException(String s){
super(s);
}
}
class pswdException extends Exception {
pswdException(String s){
super(s);
}
}
class autenticate
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
try{
System.out.println("Enter the Username");
String n = sc.nextLine();
if(n.length()<6)
{
throw new userException("Username needs 6 Charracters!");
}
try{
String a="abcd1234";
System.out.println("Enter password");
String b=sc.nextLine();
if (a.equals(b))
{
System.out.println("Login Successfull...!!");
}
else
throw new pswdException("Wrong ....Password ");
}
catch(pswdException e)
{
System.out.println(e);
}
}
catch(userException e)
{
System.out.println(e);
}
}
}

