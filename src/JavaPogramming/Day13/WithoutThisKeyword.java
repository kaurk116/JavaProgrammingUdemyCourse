package JavaPogramming.Day13;

    public class WithoutThisKeyword {
        int x,y;  //class variable
        void setData(int a,int b){//local variable //simple method
            x=a;
            y=b;
        }

        void display(){
            System.out.println(x+"  "+y );
        }
        public static void main(String[] args){
            WithoutThisKeyword thiskeyword=new WithoutThisKeyword();
            thiskeyword.setData(20,30);
            thiskeyword.display();
        }
    }
