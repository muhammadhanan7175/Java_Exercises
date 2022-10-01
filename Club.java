import java.util.*;
public class Club{
	ArrayList<Membership> ar = new ArrayList<Membership>();
 public void join(Membership m){
	 ar.add(m);
 }
 public void numberOfMember(){
	 System.out.println("Total members are" + ar.size());	 
 }
 public void search(String w){
	 for(Membership q : ar)
	 {
		 if (q.getName().equals(w))
		 {
			 System.out.println("name of member :" + q.getName());
			 System.out.println("Month of joining" + q.getMonth());
			 System.out.println("Year of joining" + q.getYear());
		 }
		 else
		 {System.out.println("Member not found");}
		 
	 } 
 }
}