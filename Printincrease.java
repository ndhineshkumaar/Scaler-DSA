import java.util.*;

public class Printincrease {
    public static void main(String args[]) {
        Scanner dk = new Scanner(System.in);
        printIncrease(dk.nextLong());
    }

    public static void printIncrease(Long N) {
        if (N == 0) {
            return;
        }
        printIncrease(N - 1);
        System.out.println(N);
    }
}
