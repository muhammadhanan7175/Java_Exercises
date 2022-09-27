
//Task 4
import java.util.Scanner;
 public class Book{
	 int bookId;
	 int pages;
	 int price;
	 public void The_get()
	 {
		 Scanner sr = new Scanner(System.in);
		 System.out.println("enter book id" );
		 int a = sr.nextInt();
		 System.out.println("enter book id" );
		 int b = sr.nextInt();
		 System.out.println("enter book id" );
		 int c = sr.nextInt();
		 bookId = a;
		 pages = b;
		 price = c;
	 }
	 public void The_show()
	 {
		 System.out.println(" Book id is " + bookId);
		 System.out.println(" pages are " + pages);
		 System.out.println(" price is " + price);
	 }
	 public void The_set(int x,int y,int z)
	 {
		bookId = x;
		pages = y;
		price = z;
	 }
	 public static void main(String[] args){
		 Book bk = new Book();
		 Scanner sr = new Scanner(System.in);
		 bk.The_get();
		 System.out.println("Displaying attributes" );
		 bk.The_show();
		 System.out.println("Setting values" );
		 int d=064;
		 int e=100;
		 int f=1500;
		 bk.The_set(d,e,f);
	 }
 }