package main;

public class Node {
	int data;
	Node next;
	int action=0;
	Node(int data,int action){
		this.data=data;
		this.next=null;
		this.action=action;
	}
}