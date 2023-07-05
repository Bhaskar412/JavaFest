import java.util.Scanner;

public class TestPrimeRange {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to find prime numbers ");
        int n = scn.nextInt();
        PrimeRange pr = new PrimeRange();
        pr.prime(n);
    }

}
