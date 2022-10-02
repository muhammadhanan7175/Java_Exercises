public class Customer{
String name;
String post;
int salary;
public Customer(String a , String b , int c){
name = a;
post = b;
salary = c;
}
public String getName(){
	return name;
}
public String getPost(){
	return post;
}
public int getSalary(){
	return salary;
}
public void dp(){
	System.out.println("customer name is " + name);
	System.out.println("customer post is " + post);
	System.out.println("customer salary is " + salary);
} 
}