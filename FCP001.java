import java.util.Scanner;
public class FCP001
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int Day=scan.nextInt();
scan.nextLine();
String Month=scan.nextLine();
int Year=scan.nextInt();
scan.close();
System.out.println(Day);
System.out.println(Month);
System.out.println(Year);
}
}