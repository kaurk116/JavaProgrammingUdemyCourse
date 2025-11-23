package JavaPogramming.Day9;

import java.util.Arrays;

public class Stringreverse {
    public static void main(String[] args){
       // Method 1
       /* String s ="Selenium";
        String reverse="";
        for (int i = s.length()-1; i >0 ; i--) {
            reverse=reverse+s.charAt(i);

        }
        System.out.println("Method 1 reverse : " reverse);
*/
        //Method 2
        String s ="Automation";
        String reverse="";
        char a[]=s.toCharArray();
        System.out.println(Arrays.toString(a));
        for (int i = a.length-1; i >=0 ; i--) {
            reverse=reverse+s.charAt(i);

        }
        System.out.println("Method 2 reverse : " +reverse);
        //method3

        StringBuffer sb =new StringBuffer("Automation");
        System.out.println(sb.reverse());
         //method 4
        StringBuilder sbb=new StringBuilder("Saini");
        System.out.println(sbb.reverse());

    }
}
