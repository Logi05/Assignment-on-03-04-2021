package com.train;

public class TestThread {
public static void main(String args[])
{
	A a=new A();
	Thread t=new Thread(a);
	t.start();
	try {
		t.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Main Thread is Running");
	
	Runnable R = () ->{
		System.out.println("Runnable is running");
	};
	
	Thread T=new Thread(R);
	T.start();
	System.out.println("Main2 Thread is Running");

}
}

class A implements Runnable
{
	@Override
	public void run() {
		System.out.println("Thread is Running");
		
	}	
}
