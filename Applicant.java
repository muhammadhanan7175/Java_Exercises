public class Applicant{
private String name ;
private String fatherName ;
private int marks ;
public Applicant(String a , String b , int c){
	name = a;
	fatherName = b;
	marks = c;
}
public void setName(String a){
	name = a;
}
public String getName(){
	return name;
}
public String getFatherName(){
	return fatherName;
}
public int getMarks(){
	return marks;
}
}