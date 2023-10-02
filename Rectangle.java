import java.util.*;
class Rectangle{
    int w;    //width
    int h;    //height
//LINE-1: write the function setw(int) to initialize w
	public void setw(int w){
	    this.w = w;
	}

//LINE-2: write the function seth(int) to initialize h
	public void seth(int h){
	    this.h = h;
	}	
//LINE-3: write the function area() to return area of rectangle
    public int area(){
        return(this.w*this.h);
    }
}
