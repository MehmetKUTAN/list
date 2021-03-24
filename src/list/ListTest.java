package list;

import java.util.Scanner;

public class ListTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List list=new List("javaList");
		Boolean bool =Boolean.TRUE;
		Character ch=new Character('M');
		Integer integer=new Integer(12345);
		String str="List Name ";
		list.insertAtFront(bool);
		list.print();
		list.insertAtFront(ch);
		list.print();
		list.insertAtBack(str);
		list.print();
		list.insertAtÝndex(integer,3);
		list.print();
		System.out.println("eleman sayisi:"+list.count());
		Object removeObject;
		try {
			removeObject=list.removeFromÝndex(3);
			System.out.println(removeObject.toString()+" listeden cýkarýldý");
			list.print();
			System.out.println("son olarak eleman sayisi:"+list.count());
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
