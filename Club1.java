import java.util.*;
import java.util.HashMap;
public class LMS{
	HashMap<int,Students> hm = new HashMap<int,Students>();
	HashSet<int> hs = new HashSet<int>();
	
public void admission(int z,String a, String b , int c){
	hm.put(z,new Membership1(a,b,c));
	hs.add(z);
}
public void studentList(){
System.out.println(" List of students is as follows ");
for(int i=0 ; i<hs.size() ;i++ )
	{
		String y = hm.get(i);
		System.out.println(" y ");
	}	
}
public void Search(String name){
for(int i=0 ; i<hs.size() ;i++ )
	{
		if(hm.get(i).getName().equals(name));
		(hm.get(i)).display();
	}	
}
}