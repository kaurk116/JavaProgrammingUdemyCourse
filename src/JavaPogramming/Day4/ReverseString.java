package JavaPogramming.Day4;

public class ReverseString {
    public static void main (String [] args) {
        String text = "Automation Testing";
        String revers_text = "";
        int text_size = text.length();

        for (int i = text_size - 1; i >= 0; i--) {
            revers_text = revers_text + text.charAt(i);
        }
        System.out.println("reverse a string is: " + revers_text);


        StringBuffer sb2 = new StringBuffer(text);
        StringBuffer revers_string = sb2.reverse();
        System.out.println("reverse a string is" +revers_string);
    }
}
