package chapter11;


public class Main4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}