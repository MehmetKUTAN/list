package list;

public class ListNode { 
	Object data;
	ListNode nextNode;
	public ListNode(Object data) {
		this(data,null);
	}
	public ListNode(Object data, ListNode nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	Object getObject()
	{
		return data;
	}
	ListNode getNext()
	{
		return nextNode;
	}	
}
