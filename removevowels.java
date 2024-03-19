import java.util.Scanner;

public class removevowels {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        String s=dk.nextLine();

        s = s.toLowerCase().replaceAll("[\\saeiou]", "");
        System.out.println(s);
    }
}
