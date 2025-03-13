import java.util.*;

class Area {
    int len;
    int breadth;

    void Area(){
        len=0;
        breadth=0;
    }

    void setDim(int l,int b){
        len=l;
        breadth=b;
    }
    void getArea(){
        System.out.println("Area of rectangle is:"+ (len*breadth));
    }
}

public class recArea{
    public static void main(String args[]){
        Area ob= new Area();
        ob.setDim(5,10);
        ob.getArea();
    }
    
}
