package chapter13;

public class Main7 {
    public static void main(String[] args) {
        int [][] numbers = new int[5][5];
        int count = 0;

        // 7

        for (int i = 0; i < 9; i++) {
            if (i > 4) {
                for (int j = 4; j <= 4; j++) {
                    numbers[i - j][j] = ++count;
                }
            } else {
                for (int j = 0; j <= 0; j++) {
                    numbers[j][i] = ++count;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
