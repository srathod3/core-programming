import java.util.Scanner;
public class largest
{
	public static void main(String args[])
	{
		int a,b,c,largest,temp;
		Scanner sc=new Scanner(System.in);
System.out.println("enter first number: ");
a=sc.nextInt();
System.out.println("enter first number: ");
b=sc.nextInt();
System.out.println("enter first number: ");
c=sc.nextInt();
temp=a;
a=b;
b=c;
c=temp;
//largest=c>temp;
System.out.println("largest number is: "+ temp);

	}
}