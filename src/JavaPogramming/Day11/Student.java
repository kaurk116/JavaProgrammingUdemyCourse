package JavaPogramming.Day11;

public class Student {
    int sid;
    String sname;
    char grade;

    void studentData(){
        System.out.println(+sid+ " " +sname+" " +grade+" ");
    }
    void setdata(int id,String name, char g){

        sid=id;
        sname=name;
        grade=g;
        System.out.println(+sid+ " " +sname+" " +grade+" ");

    }
    Student(int id, String name, char grades){
        sid=id;
        sname=name;
        grade=grades;
    }
}
