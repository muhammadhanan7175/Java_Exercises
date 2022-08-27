public class personMain {

    public static void main(String[] args) {
	// write your code here
        person1 p1=new person1("03","03","2000","ahmed");
        person1 p2=new person1("11","07","2000", "ali");
        System.out.println(p1.get_Age());
    compare(p1,p2);
}
    public static void compare(person1 a, person1 b) {
        int p1_dd = Integer.parseInt(a.dd);
        int p1_mm = Integer.parseInt(a.mm);
        int p1_yyyy = Integer.parseInt(a.yyyy);
        String p1_name = a.name;
        String p2_name = b.name;
        int d = 0;
        int m = 0;
        int y = 0;
        //for person 2
        int p2_dd = Integer.parseInt(b.dd);
        int p2_mm = Integer.parseInt(b.mm);
        int p2_yyyy = Integer.parseInt(b.yyyy);
        //for days difference
        if (p1_dd > p2_dd) {
            d = p1_dd - p2_dd;
        } else if (p1_dd < p2_dd) {
            d = p2_dd - p1_dd;
        } else if (p1_dd == p2_dd) {
            d = p1_dd - p2_dd;
        }
        //for months difference
        if (p1_mm > p2_mm) {
            m = p1_dd - p1_mm;
        } else if (p1_mm < p2_mm) {
            m = p2_mm - p1_mm;
        } else if (p1_mm == p2_mm) {
            m = p1_mm - p1_mm;
        }
        //for years difference
        if (p1_yyyy > p2_yyyy) {
            y = p1_yyyy - p2_yyyy;
            System.out.println(p2_name + " is elder");
            System.out.println(p2_name + ", Age difference =  " + y + " years _" + m + "months _" + d + "days");
        } else if (p1_yyyy < p2_yyyy) {
            y = p2_yyyy - p1_yyyy;
            System.out.println(p1_name + " is elder");
            System.out.println(p1_name + ", Age difference =  " + y + " years _" + m + "months _" + d + "days");
        } else if (p1_yyyy == p2_yyyy) {
            y = p1_yyyy - p2_yyyy;
            if (p1_mm < p2_mm) {
                System.out.println(p1_name + " is elder");
                System.out.println(p1_name + ", Age difference =  " + y + " years _" + m + "months _" + d + "days");
            } else if (p1_yyyy == p2_yyyy) {
                if (p1_mm == p2_mm)
                    if (p1_dd > p2_dd)
                        System.out.println(p2_name + " is elder");
                System.out.println(p1_name + ", Age difference =  " + y + " years _" + m + "months _" + d + "days");
            }

        }
    }
}