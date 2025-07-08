import java.io.File;

public class LinkedList<T extends Comparable<T>> {
	 Node<T> head;
	 
	 public void insert(String arr[]){
		Node<T> newNode=new Node(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],Integer.parseInt(arr[4]));
		Node<T> curr=head;
		Node<T> prev=null;
		for( ;curr != null ;prev=curr,curr=curr.next);
		if(head ==null)//case 0
			head=newNode;
		else if(curr ==head){
			newNode.next = head;
			head = newNode;
		}
		else if(curr ==null)
			prev.next=newNode;
		else{
			newNode.next=curr;
			prev.next=newNode;
		}
	}

	 public void traverse(){
		 Node<T> curr=head;
		 System.out.print("Head-->");
		 while(curr!=null){
			 System.out.print("[" +curr+"]-->");
			 curr=curr.next;
		 }
		 System.out.println("null");
	 }
	/* public void delete(T data){
		 Node<T> prev=null,curr=head;
		 for(; curr!=null && curr.data.compareTo(data)<0;prev=curr,curr=curr.next);
		 if(curr==null || !curr.data.equals(data))
			 System.out.println("Error:data not found");
		 else
			 if(curr==head)//case 1
				 head=head.next;
			 else //case2,3
				 prev.next=curr.next;

	 }*/
}
