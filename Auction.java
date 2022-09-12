import java.util.Scanner;
import java.util.HashMap;
public class Auction{
 HashMap<Lot,Bidder> hashmap1 = new HashMap <Lot,Bidder>();
 HashMap<Lot,Bidder> hashmap2 = new HashMap <Lot,Bidder>();
 HashMap<Lot,Bidder> hashmap3 = new HashMap <Lot,Bidder>();
 public static void Highest_value_bidder(Lot l, Bidder b){
	 Auction a= new Auction();
	if(b.get_bidPrice() > a.Starting_bid )
	{
	hashmap1.replace( l.getName() , b.get_bidPrice());
	hashmap3.put(b.get_bidPrice() , b.get_name() );	
	}	 
 }
 public static void Show_all(Lot l){
	 System.out.println("Auction completed");
	 System.out.println(hashmap1);
	 System.out.println(hashmap3);
 }

}