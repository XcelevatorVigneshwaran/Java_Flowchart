import java.util.Scanner;
public class FCP015
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int max=0;
if(a>b)
{
max=a;
}
else
{
max=b;
}
if(max<c)
{
max=c;
}
else
{
max=max;
}
if(max<d)
{
max=d;
}
else
{
max=max;
}
System.out.println(max);
}
}