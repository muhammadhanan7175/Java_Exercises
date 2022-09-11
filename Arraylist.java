import java.util.ArrayList;
public class Arraylist{
	public ArrayList <Practice> ar = new ArrayList<Practice>();
	public void add(String a , int b){
	ar.add(new Practice(a,b));
	}
	public void getLength(){
		System.out.println("size is " + ar.size());
		
	}
	public void remove(int d){
		ar.remove(d);
	}
	public void getIndex(String y){
		ar.indexOf(y);
	}
	public void dp(){
		for(Practice p : ar)
		{System.out.println(p) ; }
	}
}