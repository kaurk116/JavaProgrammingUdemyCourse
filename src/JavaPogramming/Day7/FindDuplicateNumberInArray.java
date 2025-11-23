package JavaPogramming.Day7;

public class FindDuplicateNumberInArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 10, 40, 50, 10, 60, 70};
        int number =10;
        int count =0;
        for(int value :a){
            if(value==number)
                count++;

        }
        System.out.println("element duplicate : " +count);
    }
}