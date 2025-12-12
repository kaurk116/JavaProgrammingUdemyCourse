package JavaPogramming.Day15;
class abc{
    void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }
}
class zyx extends abc {
    void m1(int a) { //overriding
        System.out.println(a * a);
    }

    void m2(int b) {   //overriding
        System.out.println(b * b);
    }

    void m1(int a, int b) {  //overloading
        System.out.println(a * b);
    }
}

public class OverloadingVeOverriding {
        public static void main(String[] args){
            zyx zzz=new zyx();
            zzz.m1(2,5);
        }
}
