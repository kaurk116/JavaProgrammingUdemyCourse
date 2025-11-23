package JavaPogramming.Day7;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[] = {10, 60, 70, 10, 40, 50, 10, 20, 05};
        for (int i = 8; i >=0 ; i--) {
            System.out.println(a[i]);

        }
        //using while loop
        int i=8;
        while (i>=0){
            System.out.println(a[i]);
            i--;
        }
    }
}
