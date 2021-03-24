package list;

public class List {
	private ListNode firstNode;
	private ListNode LastNode;
	private String name;
	public List(String name) {	
		this.name = name;
		firstNode=LastNode=null;
	}
	public List() {
		this("list");
	}
	public synchronized int count()
	{
	int c=0;
	Object removeItem=null;
	if(isEmpty())
		return 0;
	ListNode current=firstNode;
	while(current!=null)
	{
		c++;
		current=current.nextNode;	
	}		
	return c;
}
	private boolean isEmpty() {
		// TODO Auto-generated method stub

		if(firstNode==null)
		{
			return true;
		}
		else 
			return false;
	}
	public synchronized void insertAtFront(Object insertItem)
	{
			if(isEmpty())
				{
				firstNode=LastNode=new ListNode(insertItem);
				}
			else 
				firstNode=new ListNode(insertItem,firstNode);
	}
	public synchronized void insertAtindex(Object insertItem,int index)
	{
		if(isEmpty())
			insertAtFront( insertItem);
		else if(count()<index)
			insertAtBack(insertItem);
		else {
			int temp=1;
			ListNode current=firstNode;
			while(current!=null)
			{
			if(temp>=index-1)	break;
			
				current=current.nextNode;
				temp++;
				}
				ListNode yeni=new ListNode(insertItem);
				yeni.nextNode=current.nextNode;
						current.nextNode=yeni;
		}
	}
	public synchronized Object removeFromindex(int index) 
			throws EmptyListException{
		Object removeItem=null;
		if(isEmpty())
				throw new EmptyListException(name);
		else if(count()<=index)
			removeFromBack();
		else {
			int temp=1;
			ListNode current=firstNode;
			while(current!=null)
			{
			if(temp>=index-1)	break;
			
				current=current.nextNode;
				temp++;
				}
				removeItem=current.nextNode.data;
				current.nextNode=current.nextNode.nextNode;
				return removeItem;
		}
		return removeItem;
	}
	public synchronized void insertAtBack(Object insertItem)
	{
			if(isEmpty())
				firstNode=LastNode=new ListNode(insertItem);
			else 
				LastNode=LastNode.nextNode=new ListNode(insertItem);
	}	
	public synchronized Object removeFromFront() 
			throws EmptyListException{
		Object removeItem=null;
		if(isEmpty())
					throw new EmptyListException(name);
		removeItem=firstNode.data;
		if(firstNode==LastNode)
			firstNode=LastNode=null;
		else
			firstNode=LastNode.nextNode;
		return removeItem;
	}
	public synchronized Object removeFromBack()
			throws EmptyListException{
		Object removeItem=null;
		if(isEmpty())
					throw new EmptyListException(name);
		removeItem=LastNode.data;
		if(firstNode==LastNode)
			firstNode=LastNode=null;
		else
		{
			ListNode current=firstNode;
			while(current.nextNode!=LastNode)
			{
				current=current.nextNode;				
			}
			LastNode=current;
			current.nextNode=null;
		}
		return removeItem;
	}
	public synchronized void print()
	{
		if(isEmpty())
		{
			System.out.println("->>"+name+" isimli liste bo�");
			return;
		}
		else
			System.out.println("->>"+name+" isimli listenin elemanleri:");
		ListNode current=firstNode;
		while(current!=null)
		{
			System.out.print(current.data.toString()+" ");
			current=current.nextNode;
		}
		System.out.println();
		return;
	}
}

