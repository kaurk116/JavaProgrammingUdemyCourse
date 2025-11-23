package JavaPogramming.Day7;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70};
        boolean status=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the search element");
        int searchElement = sc.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
            if (searchElement == a[i]) {
                System.out.println("Element found");
                status=true;
                break;
            }
        }
        if(status==false)
            System.out.println("Element  not found");
        }
        }
