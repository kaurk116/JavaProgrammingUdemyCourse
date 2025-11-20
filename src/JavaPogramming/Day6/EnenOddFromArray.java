package JavaPogramming.Day6;

public class EnenOddFromArray {
    public static void main (String [] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println("even number in array------");
        for (int i = 0; i<a.length-1; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even number is : " +a[i]);
            }
            System.out.println("even number in array------");
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] % 2 == 1) {
                    System.out.println("odd number is : " +a[j]);
                }
            }
            //innhance for loop
            for(int value: a){
            if(value%2==0);
                System.out.println("even number is : " + value);
            }
        }
    }
}
