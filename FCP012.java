import java.util.Scanner;
public class FCP012
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a==0)
{
System.out.println("Zero");
}
else if(a<0)
{
System.out.println("Negative");
}
else
{
System.out.println("Positive");
}
}
}