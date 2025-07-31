import java.util.Scanner;
public class FCP006
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int number=scan.nextInt();
int last_digit=number%10;
System.out.println(last_digit);
}
}