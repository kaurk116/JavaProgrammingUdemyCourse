package JavaPogramming.Day9.Assignment;

public class RemoveSpace {
    public static void main(String[] args) {
        String string = "Java PRO GRAMMIN wITH aUTOMATION";
        string=string.replaceAll("//s","");
        System.out.println(string);
    }
}
