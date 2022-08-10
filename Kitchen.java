package PracticeforJava;

public class Kitchen {
    static void shopping(String list, int quantity) {
        System.out.println(list + " - " + quantity);
    }

    public static void main(String[] args) {

        shopping("Bread", 1);
        shopping("tea bag", 3);
        shopping("m", 18);

    }
}



