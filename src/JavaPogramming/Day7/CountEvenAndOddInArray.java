package JavaPogramming.Day7;

public class CountEvenAndOddInArray {
    public static void main(String[] args) {
        int a[] = {10, 13, 17, 18, 22, 23, 25, 27, 29};
        int even = 0;
        int odd = 0;
        for (int value : a) {
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("count of even number :" + even);
        System.out.println("count of even number :" + odd);

    }
}
