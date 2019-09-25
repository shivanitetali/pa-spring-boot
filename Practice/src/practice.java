import java.util.Iterator;

public class practice
{

	list.add(10);
	list.add(15);
	list.add(10);
	list.add(15);
	
	//displaying the list
	System.out.println("the list is: ");
	
	//create and iterator for the list
	//using iterator() method
	Iterator<Integer> iter = list.iterator();
	
	//displaying the values
	//after iterating through the list
	System.out.println("\nThe iterator values" + " of list are: ");
	
	while (iter.hasNext())
	{
		System.out.println(iter.next() + " ");
	}
			
	
}
