import java.util.*;
class shapes
{
void rect_area(int l,int b)
{
int area = l*b;
System.out.println("The Area of rectangle is :"+area);
}
void cir_area(int r) {
double circle = 3.14*r*r;
System.out.println("The Area of circle is:"+circle);
}
void square_area(int s) {
double area = s*s;
System.out.println("The Area of Square  is:"+area);
}
}

class overload
{
public static void main (String args [])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length");
int l = sc.nextInt();
System.out.println("Enter the breadth");
int b = sc.nextInt();
System.out.println("Enter the circles values");
System.out.println("Enter the radius");
int r = sc.nextInt();
System.out.println("Enter the Square values");
System.out.println("Enter the side");
int s = sc.nextInt();
shapes abc = new shapes();
abc.rect_area(l,b);
abc.cir_area(r);
abc.square_area(s);
}
}
