public class CommisionWorker extends Employee{
int basePay;
int itemSold;
int commRate;
 public CommisionWorker(String a ,String b , int c , int d, int e,int f, int h){
	super(a,b,c,d);
	basePay = e;
	itemSold = f;
	commRate = h;
 }
 
 public void setBasePay(int d){
	basePay = d;
 }
  public void setItemSold(int g){
	itemSold= g;
 }
   public void setCommRate(int v){
	commRate= v;
 }
 public int getBasePay(){
	return basePay ;
 }
  public int getItemSold(){
	return itemSold ;
 }
   public int getCommRate(){
	return commRate ;
 }
 int mpay ;
 public String toString(){
	return(" I am a Commisioned Worker "+" Name of employee is " + firstName +" "+lastName+" Age of employee is " + age+" Pay of the employee is  :" + mpay );
}
 public void calPay(){
    mpay =((itemSold*commRate)+basePay);
	System.out.println(" pay of the Commisioned Worker is calculated :" + mpay);
}

}