import java.util.*;
class InvalidInputEx extends Exception{
    String message;
    InvalidInputEx(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}