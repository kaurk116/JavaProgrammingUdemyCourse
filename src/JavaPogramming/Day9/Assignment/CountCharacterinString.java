package JavaPogramming.Day9.Assignment;

public class CountCharacterinString {
    public static void main(String[] args){
        String text ="I love java programming";
        int count_Text=text.length();
        int newcount=text.replaceAll("a","").length();
        System.out.println(text);
        System.out.println(count_Text);
        System.out.println(newcount);
    }
}
