package Methods.Examse;

import java.util.Scanner;

public class E07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        nxnMatrix(n);
    }

    private static void nxnMatrix(int n) {
        for (int row = 0; row < n; row++) {

            for (int colon = 1; colon < n; colon++) {
                System.out.print(n + " ");

            }
            System.out.println(n + " ");
        }
    }

    //2 ways
//    public class Main {
//
//        static int[][] nMatrixInitialization(int n) {
//            int[][] resultMatrix = new int[n][n];
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    resultMatrix[i][j] = n;
//                }
//            }
//            return resultMatrix;
//        }
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            int n = scanner.nextInt();
//
//            int[][] nMatrix = nMatrixInitialization(n);
//
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.printf("%d ", nMatrix[i][j]);
//                }
//                System.out.println();
//            }
//        }
//    }
}
