package uebung1;

public class Main {
    public static void main(String[] args){
        double d1 = 4.67465;
        double d2 = 0.0;


        System.out.println(Calculator.add(d1,d2));
        System.out.println(Calculator.subtract(d1,d2));
        System.out.println(Calculator.multiply(d1,d2));
        System.out.println(Calculator.divide(d1,d2));

        System.out.print("\n"+Calculator.getLog());

    }


}
