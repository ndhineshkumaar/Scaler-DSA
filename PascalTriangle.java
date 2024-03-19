public class PascalTriangle {

    public static void main(String args[]) {

        int A = 4;
        int[][] result = solve(A);

        // Print the Pascal's Triangle
        printPascalsTriangle(result);
    }

    public static int[][] solve(int A) {
        int[][] dp = new int[A][A];

        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp;
    }

    public static void printPascalsTriangle(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
