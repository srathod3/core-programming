import java.util.Scanner;
import java.util.Arrays;
public class main
{
	public static int getLargest(int a[],int total)
	{
		///int a[]={10,35,65,1,24,100,800};
		int temp,b;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;i<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a[total-1];
	}
	public static void main(String args[]){
		int a[]={10,90,20,30,1,50};
		System.out.println("largest: "+getLargest(a,5));
		//System.out.println(("enter your numbers:" +Arrays.toString(a)));
		//a=sc.nextInt();
	}
	 
}