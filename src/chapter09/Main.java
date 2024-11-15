package chapter09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max + 1);
        System.out.println(max + 1L);
        System.out.println("max: " + max + 1L);
        System.out.println("max: " + (max + 1L));

        Scanner input = new Scanner(System.in);
        System.out.print("두 정수를 입력해주세요: ");
        int x = input.nextInt();
        int y = input.nextInt();

        double result = (x + y) / 2.0;

        System.out.printf("avg: %.2f", result);
    }
}
