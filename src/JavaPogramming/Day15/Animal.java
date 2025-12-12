package JavaPogramming.Day15;

public class Animal {
        String colour ="white";

    void  eat(){
        System.out.println("eatting---");
    }
    Animal(){   //constructor overriding
        System.out.println("This is constructor parents class");
    }
    Animal(String Name){  ////premetrize constructor
        System.out.println(Name);
    }
    }
    class dog extends Animal {
    String colour ="black";
    void displayColor(){
        System.out.println("when use the super keyword " +colour);
        System.out.println("when use the super keyword "  +super.colour);
    }
    void  eat(){   //overriding
        //System.out.println("eatting-  bread------");
        super.eat();
    }
    dog (){  //constructor
        //System.out.println("This is constructor parents class");
        super();
    }

        dog (String Name){ //premetrize constructor
            //System.out.println("This is constructor parents class");
            super(Name);
        }
    }

