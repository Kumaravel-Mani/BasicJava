package Java;

public class PoliNum {
	public static void reverseNum(){
		int a,i=0,j=0;
		int num = 12121;
		a=num;
		while (a>0){
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println("reverse num is="+j);//this for print reverse numbers
		//this for check and print palindrome or not in words.
		if (num==j){
			System.out.println("Given Num is palindrome");
		}
		else{
			System.out.println("Given Num is not palindrome");
		}
		}
	//this for check group of numbers (eg)1 to 30 from palindrome total numers and count.
	public static void countNum()
	{
		int c=0;//add this new
		for(int n=1;n<50;n++){  //add this new
			int a,i=0,j=0;
			a=n;
			while (a>0){
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if (n==j){  //add this new
				System.out.print(j+ ",");
				c++;
			}
		}
		System.out.println("count of palindrome num="+c);//add this new.
	}
		public static void main(String[] args){

	reverseNum();
	countNum();
	}
}
