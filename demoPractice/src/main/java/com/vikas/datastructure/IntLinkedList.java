package com.vikas.datastructure;

public class IntLinkedList {
	private Node head;
	private IntLinkedList(int item){
		head=new Node();
		head.value=item;
		head.link=null;
	}
	private class Node{
		int value;
		Node link;
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
	n.value = item;
	n.link = head;
	head = n;
	return true;
}
	//insert on the end
	private boolean insertInEnd(int item){
		Node n = new Node();
		Node newNode ;
		newNode = head;
		while(newNode.link !=null){
			newNode = newNode.link;
		}
		n.value=item;
		n.link=null;
		newNode.link=n;
		return true;
	}
private boolean delete(int item){
	Node h = head;
	Node h1 = head.link;
	if(head.value == item){
		head = head.link;
		return true;
	}else{
		while(true){
			if(h1==null || h1.value==item){
				break;
			}else{
				h=h1;
				h1=h1.link;
			}
		}
		if(h1!=null){
			h.link=h1.link;
			return true;
		}else return false;
	}
}
private void sortList(){
	Node a = head;
	int c=0;
	while(a.link!=null){
		Node b =head;
		while(b.link!=null){			
			if(b.value>b.link.value){
				c=b.value;
				b.value=b.link.value;
				b.link.value=c;
			}
			b=b.link;
		}
		a=a.link;
	}
	
}
private void printList(){
	Node z =  head;
	while(z!=null){
		System.out.println(z.value);
		z=z.link;
	}
	System.out.println("=================");
}
}
