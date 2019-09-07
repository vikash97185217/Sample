package com.vikas.datastructure;

public class IntLinkedList {
	private Node head;
	private IntLinkedList(int item){
		head=new Node();
		head.data=item;
		head.next=null;
	}
	private class Node{
		int data;
		Node next;
	}
	public static void main(String[] args) {
		IntLinkedList i = new IntLinkedList(10);
		
		i.insertInStart(1);
		i.insertInStart(2);
		i.insertInStart(3);
		i.printList();
		/*i.delete(2);
		i.printList();
		i.insertInStart(6);
		i.insertInStart(8);
		i.printList();
		i.delete(10);*/
		/*i.insertInEnd(1);
		i.insertInEnd(2);*/
		System.out.println();
		i.sortList();
		i.printList();
	}
	//insert on the start
private boolean insertInStart(int item){
	Node n = new Node();
	n.data = item;
	n.next = head;
	head = n;
	return true;
}
	//insert on the end
	private boolean insertInEnd(int item){
		Node n = new Node();
		Node newNode ;
		newNode = head;
		while(newNode.next !=null){
			newNode = newNode.next;
		}
		n.data=item;
		n.next=null;
		newNode.next=n;
		return true;
	}
private boolean delete(int item){
	Node h = head;
	Node h1 = head.next;
	if(head.data == item){
		head = head.next;
		return true;
	}else{
		while(true){
			if(h1==null || h1.data==item){
				break;
			}else{
				h=h1;
				h1=h1.next;
			}
		}
		if(h1!=null){
			h.next=h1.next;
			return true;
		}else return false;
	}
}
private void sortList(){
	Node a = head;
	int c=0;
	while(a.next!=null){
		Node b =head;
		while(b.next!=null){			
			if(b.data>b.next.data){
				c=b.data;
				b.data=b.next.data;
				b.next.data=c;
			}
			b=b.next;
		}
		a=a.next;
	}
	
}
private void printList(){
	Node z =  head;
	while(z!=null){
		System.out.println(z.data);
		z=z.next;
	}
	System.out.println("=================");
}
}
