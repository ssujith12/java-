import java.util.*;
class Matrix
{
public static void main(String args[])
{
int i,j,r,c;
boolean f = true;
Scanner n = new Scanner(System.in);
int a[][] = new int [20][20];
int b[][] = new int [20][20];
System.out.println("Matrix rows and columns");
r = n.nextInt();
c = n.nextInt();
System.out.println("Matrix elements Please...");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j] = n.nextInt();
}
}


for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
b[i][j] = a[i][j];
}
}
System.out.println("The Transpose Matrix is:\n");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(b[j][i]+" ");
}
System.out.println();
}

System.out.println("The Matrix is:\n");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{

if(a[i][j] != b[i][j])
{
  f =false;
break;
}

}
}

if(f==true)
{
System.out.println("The matrix is Symetric");
}
else
{
System.out.println("Not Symmetric");
}
}

}
