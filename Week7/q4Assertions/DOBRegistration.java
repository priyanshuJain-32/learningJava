public class DOBRegistration{
    private int day, month, year;
    public DOBRegistration(int day, int month, int year){
        assert 0 < day && day <= 31: day;
        this.day = day;
        assert 0 < month && month <=12: month;
        this.month = month;
        this.year = year;
    }
}