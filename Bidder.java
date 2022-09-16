public class Bidder{
	String cnic;
	String name;
	int bid_price;
	
 public Bidder(String a , String b , int c){
 cnic = a;
 name = b;
 bid_price = c;
}
public String get_cnic() {
return  (cnic);
}
public String get_name() {
return  (name);
}
public int get_bidPrice() {
return  (bid_price);
}
public void show(){
System.out.println(cnic);
System.out.println(name);
System.out.println(bid_price);
}
}