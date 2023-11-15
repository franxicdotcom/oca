package uebung1;

public class Calculator {

    private static String log = "";
    public static String getLog() {
        return log;
    }

    static double add(double d1, double d2){
        double result = 0;
        result = d1+d2;
        log(d1,d2,"+",result);
        return result;
    }

    static double subtract(double d1, double d2){
        double result = 0;
        result = d1-d2;
        log(d1,d2,"-",result);
        return result;
    }

    static double multiply(double d1, double d2){
        double result = 0;
        result = d1*d2;
        log(d1,d2,"*",result);
        return result;
    }

    static double divide(double d1, double d2){
        //if(Double.isInfinite (d1/ d2)) throw new AssertionError();

        assert Double.isFinite (d1/ d2) : "Division by zero!";
        assert Double.isInfinite(d1/d2);
        double result = 0;
        result = d1/d2;
        log(d1,d2,"/",result);
        return result;

    }

    private static void log(double d1, double d2, String operator, double result){
        log += "Operand 1: " + d1
                +" Operand 2 : " + d2
                +", Operator: " + operator
                +", Ergebnis: " + result
                +"\n";

    }
}
