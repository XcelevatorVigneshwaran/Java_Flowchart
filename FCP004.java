import java.util.Scanner;
public class FCP004
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
double num1=scan.nextDouble();
double num2=scan.nextDouble();
int sum=(int)(num1+num2);
int sub=(int)(num1-num2);
int mul=(int)(num1*num2);
double div=num1/num2;
int Idiv=(int)(num1/num2);
int mod=(int)(num1%num2);
System.out.println(sum);
System.out.println(sub);
System.out.println(mul);
System.out.println(div);
System.out.println(Idiv);
System.out.println(mod);
}
}
