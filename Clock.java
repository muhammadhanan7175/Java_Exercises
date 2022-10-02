public class Clock {
String time;
String status1 = "AM";
Digit hour ;
Digit minute ;
Digit seconds ;

public Clock(int a , int b , int c)
{
Digit hour = new Digit(a,12);
Digit minute =  new Digit(b,60);
Digit seconds =  new Digit(c,60);
time = hour.displayDigit()+":"+minute.displayDigit()+":"+seconds.displayDigit()+" "+  status1 ;
}
public void setTime(int h , int m , int s , String n)
{
hour.setValue(h);
minute.setValue(m);
seconds.setValue(s);
hour.setStatus1(n);
time = hour.displayDigit()+":"+minute.displayDigit()+":"+seconds.displayDigit()+" "+ status1 ;
}
public void clockDisplay()
{ 
System.out.print(time);
}
public void tick()
{
	seconds.increment();
	if(seconds.get()==0)
	{minute.increment();}
	else if(minute.get()==0)
	{hour.increment();}
	else if(hour.get()==0)
	{
		int m = 1;
		hour.setValue(m) ;
		if (status1 == "AM")
		{
			String l = "PM";
			hour.setStatus1(l);
		}
		else
		{
			String o = "AM";
			hour.setStatus1(o);
		}
	}
	time = hour.displayDigit()+":"+minute.displayDigit()+":"+seconds.displayDigit()+" "+  hour.getStatus1() ;
	}
  }