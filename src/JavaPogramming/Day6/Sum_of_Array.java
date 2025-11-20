package JavaPogramming.Day6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sum_of_Array {
    public static void main (String [] args){
        int a[]={1,2,3,4,5,6};
         int b[]=new int[5];b[0]=1;

         b[0]=1;
        b[1]=2;
        b[2]=4;
        b[3]=5;
        b[4]=3;

        System.out.println(b[2]);
        System.out.println(a[2]);
        System.out.println(Arrays.toString(a));
        System.out.println();
        int sum=0;
        for (int i = 0; i <= b.length-1; i++) {
            sum=sum+i;
        }
        System.out.println("sum of array" +sum);
        //inhance of for loop
        for(int sum1:a){
            sum=sum+sum1;
        }
        System.out.println("inhance of loop in array" +sum);
    }
}
