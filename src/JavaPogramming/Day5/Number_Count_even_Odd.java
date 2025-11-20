package JavaPogramming.Day5;

public class Number_Count_even_Odd {
    public static void main (String [] args) {
        long number = 8872682291l;
        long even_count = 0;
        long odd_count = 0;
        while (number > 0) {
            long reminder = number % 10;
            if (reminder % 2 == 0) {
                even_count++;
            } else
                odd_count++;
            number=number/10;

        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
