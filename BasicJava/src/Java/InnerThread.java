package Java;

public class InnerThread {
	public static void main(String[] args){
		Runnable r1=new Runnable(){
		public void run(){
		for(int i=0;i<=10;i++){
		System.out.println("class = "+i);
		}
		}
		};
		Thread t1=new Thread(r1);
		t1.start();
		////////////
		new Thread(()->{for(int i=0;i<=20;i++){
		System.out.println("inner class = "+i);
		}
		}).start();
		}
}
