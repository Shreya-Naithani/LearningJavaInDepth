package unit_03;
/*user- making thread
 * go,c#,java supports multi threading
 * if we have written code in sequence 
 * parallel processing is expensive concurrent is cheap and is close to parallel
 * 
 */

import java.util.Scanner;

public class P16_Multithreading {
	
	public static void main(String[]args)
	{
//		ABC obj = new ABC();
//		obj.threadConcept();
//		obj.threadsSynchronization();
//		obj.interThreadCommunication();
//		obj.ProducerConsumerProblems();
//		obj.Wait_And_Notify();
		
		
//		C1 obj1= new C1();
//		obj1.show1();
//		C2 obj2 = new C2();
//		obj2.show2();
		
		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

class C1
{
	void show1()
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println(a);
		System.out.println("\n Done");
		obj.close();
	}	
}

class C2
{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"HEY");
		}
	}
}

class T1 extends Thread{
	public void run() {
		Scanner obj=new Scanner (System.in);
		int a=obj.nextInt();
		System.out.println(a);
		System.out.println("\n Done");
		obj.close();
	}
}
class T2 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" HEY");
		}
	}
}
class T3 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" HEY2!");
		}
	}
}

class ABC {
	void threadConcept() {
		
	}
	void threadsSynchronization() {
		
	}
	void interThreadCommunication() {
		
	}
	void ProducerConsumerProblems(){
		
	}
	void Wait_And_Notify() {
		
	}
	
}
