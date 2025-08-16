import java.util.Scanner;

public class XPatternMatrix {
    public static String[][] Xmatrix(int val) {
        String matrix[][] = new String[val][val];
        if (val % 2 == 1) {

            for (int i = 0; i < val; i++) {
                for (int j = 0; j < val; j++) {
                    if (i == j) {
                        matrix[i][j] = String.valueOf(i + 1);

                    } else if (i + j == val - 1) {
                        matrix[i][j] = String.valueOf(val - i);
                    } else {
                        matrix[i][j] = "-";
                    }
                }
            }
        }
        return matrix;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int val = sc.nextInt();
        String matrix[][] = Xmatrix(val);
        for (String[] i : matrix) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
