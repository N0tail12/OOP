public class DateTest{
    public static void main(String []args){
        MyDate date1= new MyDate();
        date1.print();
        date1.getDay();
        date1.setDay(13);
        date1.setMonth(13);
        date1.setYear(2021);
        date1.setYear(-2021);
        date1.accept();
        date1.print();
    }
}