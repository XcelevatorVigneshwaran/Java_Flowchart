import java.util.Scanner;
public class FCP003
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int num1=scan.nextInt();
int num2=scan.nextInt();
int temp=0;
temp=num1;
num1=num2;
num2=temp;
System.out.println(num1);
System.out.println(num2);
}
}