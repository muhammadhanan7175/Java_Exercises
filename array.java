import java.util.Arrays;
import java.util.ArrayList;
public class array{
public static void main (String[] args){
	ArrayList<String> ar = new ArrayList<String>();
	System.out.println("adding elements in arraylist");
	ar.add("hanan");
	ar.add("37");
	ar.add("hello");
	ar.add("43");
	System.out.println("printing array list");
	for (String ar1 : ar)
	{
		System.out.println(ar1);
	}
	ar.add(2,"hanan");
	System.out.println("printing array list");
	for (String ar1 : ar)
	{
		System.out.println(ar);
	}
	System.out.println("checking element at index 3");
		System.out.println(ar.get(3));
	System.out.println("checking size");
	System.out.println(ar.size());
	System.out.println("removing element at index zero element at index 3");
	ar.remove("hello");
	System.out.println("checking size");
	System.out.println(ar.size());
	System.out.println("printing array list");
	for (String ar1 : ar)
	{
		System.out.println(ar);
	}
	
}
}