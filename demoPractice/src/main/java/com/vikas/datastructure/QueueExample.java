package com.vikas.datastructure;

public class QueueExample {
	int q[];
	int size;
	int front;
	int last;
	int total;
	private QueueExample(int size){
		this.q=new int[size];
		this.size=size;
	}
	public static void main(String[] args){
		QueueExample q = new QueueExample(5);
		q.enqueue(10);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		System.out.println("item dqueued: "+q.dqueue());
		q.enqueue(5);
		q.enqueue(6);
		System.out.println("item dqueued: "+q.dqueue());
	}
	private boolean enqueue(int item) {
		if(total<=size){
			System.out.println("item inserted: "+item);
			q[last]=item;
			last=(last+1)%size;
			total++;
			return true;
		}
		else return false;	
	}
	private int dqueue() {
		if(total<=size){
			int item= q[front];
			front = (front+1)%size;
			total--;
			return item;
		}
		else return 0;	
	}
}
