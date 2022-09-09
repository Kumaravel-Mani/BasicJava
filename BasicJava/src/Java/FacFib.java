package Java;

public class FacFib {
	public static void fibnaocii(){
		int a=0,b=1,c;
		System.out.println("fibnaoci series");
		System.out.print(a+ ", ");
		System.out.print(b+ ", ");
		for(int i=0; i<10; i++){
		c=a+b;
		System.out.print(c+ ", ");
		a=b;
		b=c;
		}
		}
		public static void main(String[] args){
		fibnaocii();
		}
}
