package JavaPogramming.Day9.Assignment;

public class CountWordinString {
    public static void main(String[] args) {
        String text = "I love java programming hghghj";
        int count =1;
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i)==' ')
            {
                count++;
            }


        }
        System.out.println(count);
    }
}
