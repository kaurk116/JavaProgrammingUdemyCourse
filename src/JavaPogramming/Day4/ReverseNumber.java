package JavaPogramming.Day4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");

        //Reverse Number
        int num =sc.nextInt();
        StringBuffer sb =new StringBuffer(String.valueOf(num));
        StringBuffer rev =sb.reverse();
        System.out.println(rev);

        /*//Reverse String

        String orignal  =sc.nextLine();
        StringBuffer sb2=new StringBuffer(orignal);
        StringBuffer new_string =sb.reverse();
        System.out.println(new_string);*/

    }
}
