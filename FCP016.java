import java.util.Scanner;
public class FCP016
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int y=scan.nextInt();
if(y%400==0)
{
System.out.println("Yes");
}
else if(y%4==0)
{
if(y%100!=0)
{
System.out.println("Yes");
}
}
else
{
System.out.println("No");
}
}
}