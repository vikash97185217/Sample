package com.vikas.datastructure;

public class StackExample {
	int[] stack;
	int size;
	int top;
	public StackExample(int size){
		this.size=size;
		this.stack=new int[size];
		this.top=0;
	}
	private boolean push(int item){
		if(!isFull()){
			stack[top]=item;
			top++;
			System.out.println("item pushed "+item);
			return true;
		}
		else 
			return false;
	}
	private boolean isFull(){
		return (top==size);
	}
	private boolean isEmpty(){
		return (top==0);
	}
	private int pop(){
		if(!isEmpty()){
			top--;
			return stack[top];
		}
		else return 0;
	}
	public static void main(String[] args){
		StackExample s = new StackExample(3);
		s.push(10);
		s.push(7);
		s.push(2);
		System.out.println("item poped "+s.pop());
		System.out.println("item poped "+s.pop());
		System.out.println("item poped "+s.pop());
	}
}
