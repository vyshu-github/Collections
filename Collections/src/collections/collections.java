package collections;

import java.util.ArrayList;

public class collections {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		list1.add("Vyshnavi");
		list1.add("Urmila");
		list1.add("Prameela");
		list1.add("Haritha");
		list1.add("Triveni");
		ArrayList list2=new ArrayList();
		list2.add("Navya");
		list1.addAll(list2);
		System.out.println(list1);
	}
	
	
	

}
