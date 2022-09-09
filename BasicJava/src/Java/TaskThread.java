package Java;

public class TaskThread {
	public static void main(String[] arags)
	{
	Runnable r1=new Runnable(){
public void run(){
	for (int i=0;i<=10;i++)
	{
System.out.println(i);
	}
	System.out.println("inner class thread...");
}
	};
	Thread t1=new Thread(r1);
	t1.start();
	//////lamda////
	Runnable r2=()->{
	for (int i=0;i<=10;i++)
	{
System.out.println("lamda class ="+i);
	}
	};
	Thread t2=new Thread(r2);
	t2.start();
	//////lamda more simblify///
	Runnable r3=()->{
		for (int i=1;i<=10;i++)
		{
		System.out.println("lamda more simblify = "+i);
		try {
               Thread.sleep(500);
            } catch(Exception e) {
               e.printStackTrace();
            }
}
};
	Thread t3=new Thread(r3);
	t3.start();
	//////more simply/////
	new Thread(()->{
		for (int i=1;i<=10;i++){
			System.out.println("more simple 1 line implement = "+i);
		}
		}).start();
}
}
