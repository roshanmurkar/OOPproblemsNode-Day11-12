package main;

public class LinkedListStack {
	Node head;
	//add element to stack
		public void addNode(int data,int action) {
			Node node = new Node(data,action);
			if (head == null) {
				head = node;
			} else {
				node.next = head;
				head = node;
			}
		}
		
		//print stack
		public void printList() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "->");
				if(temp.action==0) {
					System.out.print("purcsese");
				}else {
					System.out.print("sold");
				}
				temp = temp.next;
			}
			System.out.println("");
		}
		
		//deleting element 
		public void deleteHead() {
			System.out.println("deleting head node");
			Node temp=head;
			if(temp!=null) {
				head=temp.next;
			}
		}
}
