import java.util.Scanner;
class alphabet{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter a year");
int start = s.nextInt();

System.out.println("enter a year");
int end = s.nextInt();
while(start<=end)
{
if((start%4==0 && start%100!=0) || (start%400==0))
{
System.out.println(start);

}
start++;
}
}
}
