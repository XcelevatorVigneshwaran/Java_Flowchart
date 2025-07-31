import java.util.Scanner;
public class FCP009
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int d=scan.nextInt();
int e=scan.nextInt();
int a=d-1;
int m=a%e;
int r=a-m;
System.out.println(r);
}
}