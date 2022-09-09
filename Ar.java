import java.util.ArrayList;
public class Ar{
	int i;
	String m;
	int n;
	ArrayList <Customer> ar = new ArrayList<Customer>();
public void addCustomer(String a , String b , int c){
	ar.add(new Customer(a,b,c));
}
public void searchCustomer(String a ){
	for( Customer c : ar)
	{
		if(c.getName().equals(a))
		{
			System.out.println("customer recognized");
			System.out.println("customer details");
			System.out.println("customer name is " + c.getName());
			System.out.println("customer post is " + c.getPost());
			System.out.println("customer salary is " + c.getSalary());
		}
	}
}
public void replaceCustomerName(String d , String a){
	
	for( Customer c : ar)
	{
		if(c.getName().equals(a))
		{
			i = ar.indexOf(c) ;
			m =c.getPost() ;
			n = c.getSalary();
		}
	}
	ar.remove(i);
	ar.add(i,new Customer(d,m,n));
	System.out.println(" edited customer details are " + ar.get(i));
	
}
}