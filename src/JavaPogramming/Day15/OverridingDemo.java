package JavaPogramming.Day15;

class RBIBank {
    Double rateOfInterest() {
        return 0.0;
    }
}
    class pnbBank extends RBIBank {
        Double rateOfInterest() {
            return 10.5;
        }
    }
        class icic extends RBIBank{
            Double rateOfInterest(){
                return 12.5;
        }
    }

public class OverridingDemo {
        public static void main(String[] args){
            pnbBank pnbBank=new pnbBank();
            System.out.println(pnbBank.rateOfInterest());

            icic icic=new icic();
            System.out.println(icic.rateOfInterest());
        }
}
