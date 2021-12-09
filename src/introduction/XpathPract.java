package introduction;

import java.util.Collections;
import java.util.List;

public class XpathPract {
	//int Order;

	public static int fib(int n)
	{ 
		if (n == 0) 
		{ return 0; }
		if (n == 1) 
		{ return 1; } 
	return fib(n - 1) + fib(n - 2); 
	}
	
	/*public static void collSort() {
	
	    
	        //Creating Order object to demonstrate Sorting of Object in Java
			Order ord1 = new Order(101,2000, "Sony");
	        Order ord2 = new Order(102,4000, "Hitachi");
	        Order ord3 = new Order(103,6000, "Philips");
	     
	        //putting Objects into Collection to sort
	        List<Order> orders = new ArrayList<Order>();
	        orders.add(ord3);
	        orders.add(ord1);
	        orders.add(ord2);
	     
	        //printing unsorted collection
	        System.out.println("Unsorted Collection : " + orders);
	     
	        //Sorting Order Object on natural order - ascending
	        Collections.sort(orders);
	     
	        //printing sorted collection
	        System.out.println("List of Order object sorted in natural order : " + orders);
	     
	        // Sorting object in descending order in Java
	        Collections.sort(orders, Collections.reverseOrder());
	        System.out.println("List of object sorted in descending order : " + orders);
	             
	        //Sorting object using Comparator in Java
	        Collections.sort(orders, new Order.OrderByAmount());
	        System.out.println("List of Order object sorted using Comparator - amount : " + orders);
	     
	        // Comparator sorting Example - Sorting based on customer
	        Collections.sort(orders, new Order.OrderByCustomer());
	        System.out.println("Collection of Orders sorted using Comparator - by customer : " + orders);
	    }
*/
	public static void strRev()
	{
		  String str = "Lavanya Kishore";
	        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
	        for(int i= chars.length-1; i>=0; i--) {
	            System.out.print(chars[i]);
	            }
	}
	
	public static void StrRev2()
	{
		String str1 ="Lavanya";
		StringBuilder sn = new StringBuilder();
		sn.append(str1);
		System.out.println("The reverse value is.."+sn.reverse());
	}
	
	public static void revnum()
	{
		int hj=1234;
		int rev = 0;
			while(hj!=0) {
			rev=rev*0+hj%10;
			hj=hj/10;
			}
		System.out.println(rev);
	}
	//Read more: https://www.java67.com/2012/10/how-to-sort-object-in-java-comparator-comparable-example.html#ixzz7EO8IGjQR
public static void main(String args[]) {
	System.out.println(fib(10));
	//collSort();
	strRev();
	StrRev2();
	revnum();
}
}

