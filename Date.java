public class Date {
    private int day, month, year;

    public void Date(){
        this.day = 01;
        this.month = 01;
        this.year = 1990;
    }
    public void Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public int getDate(){
        return(this.day);
    }
    public int getMonth(){
        return(this.month);
    }
    public int getYear(){
        return(this.year);
    }
}