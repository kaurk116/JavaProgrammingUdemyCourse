package JavaPogramming.day12;

public class CallByReference {
    public static void main(String[] args){
        Test2 test=new Test2();
        test.number=100;
        System.out.println("before print number " +test.number);
        test.M2(test);
        System.out.println("before print number " +test.number);
    }
}
