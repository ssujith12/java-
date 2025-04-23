import java.util.*;
class EvenException extends Exception {
EvenException(String s)
{
super(s);
}
}
class oddException extends Exception {
oddException(String s)
{
super(s);
}
}
class check {
static void even(int n) throws EvenException,oddException
{
if(n%2==0)
{
throw new EvenException("No is even");
}
else
throw new oddException("No is odd!!");
}
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int n =sc.nextInt();
try{
even(n);
}
catch(EvenException e)
{
System.out.println(e);
}
catch(oddException e)
{
System.out.println(e);
}
}
}
