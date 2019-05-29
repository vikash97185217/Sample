package com.vikas.multithreading;
public class ThreadDemo implements Runnable{  
	public void run(){  
		for(int i=1;i<5;i++){  
			try{
				System.out.println("this thread will sleep:"+Thread.currentThread().getName());
				System.out.println(i); 
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}  
			/*System.out.println("this thread is alive:"+Thread.currentThread().getName());*/
			
			
		}  
	}  
	public static void main(String args[]){  
		ThreadDemo t1=new ThreadDemo();  
		ThreadDemo t2=new ThreadDemo();  
Thread t11 = new  Thread(t1);
Thread t22 = new  Thread(t2);
		t11.start();
		t11.setName("t1");
		t22.start();  
		t22.setName("t2");
	}  
} 