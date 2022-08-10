package PracticeforJava;

public class overloading {
    static int plusMethod(int a , int b ) {
        System.out.println(a+b);
        return a+b;
    }
    static double plusMethod(double a, double b){
        return a+b;
    }
    static String plusMethod(String a){
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        int myFirstprogram = plusMethod(15,5);
        double mySecondory = plusMethod(10.50, 20.25);
        //System.out.println("int" + myFirstprogram);
        System.out.println("double" + mySecondory);
        plusMethod("margi");

    }

    }

