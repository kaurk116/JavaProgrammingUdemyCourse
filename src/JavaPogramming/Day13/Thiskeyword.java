package JavaPogramming.Day13;

public class Thiskeyword {
    int x,y;  //class variable
    void setData(int x,int y){//local variable //simple method
        this.x=x;   //use this keyword if class variable and local variable are same
        this.y=y;
    }

    void display(){
        System.out.println(x+"  "+y );
    }
    public static void main(String[] args){
        Thiskeyword thiskeyword=new Thiskeyword();
        thiskeyword.setData(20,30);
        thiskeyword.display();
    }
}
