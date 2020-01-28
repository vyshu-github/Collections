package collections;

import java.util.LinkedList;
 
public class LinkedList {
	    public static void main(String[] args) 
	    {
	        //Create linked list
	        LinkedList l1 = new LinkedList();
	         
	        //Add elements
	         l1.add("A");
	         l1.add("B");
	         l1.add("C");
	         l1.add("D");
	         
	        System.out.println(l1);
	         
	        //Add elements at specified position
	        l1.add(4, "A");
	        l1.add(5, "A");
	         
	        System.out.println(l1);
	         
	        //Remove element
	        l1.remove("A");     //removes A
	        l1.remove(0);       //removes B
	         
	        System.out.println(l1);
	         
	        //Iterate
	        ListIterator itrator = l1.listIterator();
	 
	        while (itrator.hasNext()) {
	            System.out.println(itrator.next());
	        }
	    }
	}

