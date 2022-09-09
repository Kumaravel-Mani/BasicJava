package Java;
public class CountPrintArm {
	public static void CountAndPrintArmstrongNumber()
	{
	int c=0;
	for(int n=1;n<1000;n++)
	{
		int a,i,j=0;
		a=n;
		while (a > 0){
			i =a %10;
			j=j+(i*i*i);
			a=a/10;
		}
		if (j == n) 
		{
			System.out.println("Armsrong number is =" +j);
			c++;
		}}
System.out.println("count of armstring number is =" +c);
}
public static void main(String[] args) 
{
	CountAndPrintArmstrongNumber();
}
	}
