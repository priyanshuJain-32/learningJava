class Point{
    private int x, y;
    // implement the constructor and
    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }
    // override the toString() and equals() methods
    public String toString(Object p){
        if (p instanceof Point) {
            Point myp = (Point) p;
            String point = "("+Integer.toString(myp.x)+","+Integer.toString(myp.y)+")";
            return point;
        }
        return "-1";
    }
    public boolean equals(Object p){
        if (p instanceof Point){
            Point myp = (Point) p;
            if (this.x==myp.x && this.y==myp.y){
            return true;
            } else {
            return false;
            }
        }
        return false;
    }
}