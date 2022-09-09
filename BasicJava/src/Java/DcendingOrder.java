package Java;

public class DcendingOrder {
	public static void dscendingOrder()
	{
		int temp;
		int a[]={10,100,200,40,20 };
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i]<a[j])
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}
		System.out.println("Dscending Order");
		for (int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
		int maximumNumber =a[0];
		System.out.println("maximum number is "+maximumNumber);
		int minimumNumber =a[a.length -1];
		System.out.println("minimum Number is" +minimumNumber);
		int thirdMaxNumber =a[a.length-3];
		System.out.println("Third maximum" +thirdMaxNumber);
		int thirdMinNumber =a[2];
		System.out.println("Third minmum" +thirdMinNumber);
	}
public static void main(String[] args) {
	dscendingOrder();
}
}
