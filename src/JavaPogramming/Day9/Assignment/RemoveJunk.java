package JavaPogramming.Day9.Assignment;

import java.util.Scanner;

public class RemoveJunk {
    public static void main(String[] args){
        String string ="@#$%wertQEWR789";
string=string.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(string);
}
}