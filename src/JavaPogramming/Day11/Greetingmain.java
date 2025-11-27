package JavaPogramming.Day11;

public class Greetingmain {
    public static void main (String[] args){
        Greeting greeting =new Greeting();
        greeting.M1();

        String sr =greeting.M2();
        System.out.println(sr);

        System.out.println(greeting.M2());

        greeting.M3("Karamjeet");
        System.out.println();

        String st= greeting.M4("Aakash");
        System.out.println(st);

        System.out.println(greeting.M4("AAkash"));
    }
}
