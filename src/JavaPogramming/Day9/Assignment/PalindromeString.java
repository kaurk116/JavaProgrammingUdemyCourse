package JavaPogramming.Day9.Assignment;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String string = sc.next();
        String orinal_string=string;
        String reverse_string="";
        for (int i = orinal_string.length()-1; i >=0 ; i--) {
            reverse_string = reverse_string + orinal_string.charAt(i);
        }
        if(orinal_string.equals(reverse_string)){
            System.out.println(reverse_string + " : Palindrome String");
        }else
        System.out.println(reverse_string + " : Palindrome not String");
    }
}
