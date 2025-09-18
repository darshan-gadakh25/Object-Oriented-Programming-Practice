import java.util.*;
public class CRUDLinkedList{
	
	public static void main(String [] args){
		
		LinkedList<String> list=new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}
}