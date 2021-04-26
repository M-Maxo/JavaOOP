package linkedList_arrayList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		// LinkedList Declaration
		LinkedList<String> linkedList = new LinkedList<String>(); // ArrayList<String> 
		linkedList.add("Item 1");
		linkedList.add("Item 2");
		linkedList.add("Item 3");
		linkedList.add("Item 4");
		linkedList.add("Item 5");
		System.out.println("LinkeList Content: " + linkedList);
		
		// Add first & Add Last
		linkedList.addFirst("First Item");
		linkedList.addLast("Last Item");
		System.out.println("LinkedList content after adding new items: " + linkedList);
		
		// get and set values
		Object firstVar = linkedList.get(0);
		System.out.println("First item: " + firstVar);
		
		linkedList.set(0, "first Element Changed!!");
		System.out.println("First item after change...:  " + linkedList.get(0));
		
		
		// remove first and last element
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("linkedList after removing: " + linkedList);
		
		// Add to a position and remove from the position
		linkedList.add(0, "new first item");
		System.out.println(linkedList);
		
		linkedList.remove(0);
		System.out.println(linkedList);
		

	}

}
