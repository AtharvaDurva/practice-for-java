package PracticeforJava;

public class shopping {

        static void shopping(String items, int qty, String unit) {
            System.out.println(items + " = " + qty + " " + unit);
        }

        public static void main(String[] args) {
            shopping("Milk", 1, "Litre");
            shopping("Apple", 1, "Dozen");
            shopping("Spoons", 1, "Set");
        }
    }



