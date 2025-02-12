import java.util.*;
class Mat
{
public static void main(String args[])
{
int i,j,r1,r2,c1,c2;
Scanner n = new Scanner(System.in);
int a[][] = new int[20] [20];
int b[][] = new int[20] [20];
int c[][] = new int[20] [20];
System.out.println("Matrix Addition\n Enter the no of rows and columns of first matrix");
r1 = n.nextInt();
c1 = n.nextInt();
System.out.println("Enter the no of rows and columns of second matrix");
r2 = n.nextInt();
c2 = n.nextInt();
System.out.println("First Matrix elment");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j] = n.nextInt();
}
}
System.out.println("Second Matrix Element");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j] =n.nextInt();
}
}
System.out.println("Sum of a matrix");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
c[i][j]=a[i][j] + b[i][j];
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.println("\t"+c[i][j]);
}
System.out.println("\n");
}
}
}
