public class person1 {
    String name;
    String dd;
    String mm;
    String yyyy;

    public person1 (String date, String month, String year, String name) {
        this.dd = date;
        this.mm = month;
        this.yyyy = year;
        this.name = name;
    }

    public String get_Age() {
        return (dd + ":" + mm + ":" + yyyy);
    }

}