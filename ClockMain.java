import java.util.Scanner;
public class l;;
 {
	public static void main(String args[])throws Exception{
	int hour , mint , seconds ;
	Scanner s = new Scanner(System.in);
	System.out.print("enter time hour , minutes and seconds ");
	seconds = s.nextInt();
	mint = s.nextInt();
	hour = s.nextInt();
	 
	 Clock c = new Clock(seconds,mint,hour);
	 
	  for (int i=0; i>-1; i++)
	  {
		  c.clockDisplay();
		  Thread.sleep(1000);
		  c.tick();
	  }
 	}
 }