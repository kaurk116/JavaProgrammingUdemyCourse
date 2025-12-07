package JavaPogramming.day12;

public class CallByValue {
    public static void main(String[] args){
        Test testMethod =new Test();
        int number=100;
        System.out.println("before print number " +number);
        testMethod.m1(number);
        System.out.println("before print number " +number);

    }
}
