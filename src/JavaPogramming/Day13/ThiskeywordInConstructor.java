package JavaPogramming.Day13;

public class ThiskeywordInConstructor {
        int x,y;  //class variable
    ThiskeywordInConstructor (int x , int y){
            this.x=x;
            this.y=y;
        }

        void display(){
            System.out.println(x+"  "+y );
        }
        public static void main(String[] args){
            ThiskeywordInConstructor thiskeyword=new ThiskeywordInConstructor(23,40);
            thiskeyword.display();
        }
    }
