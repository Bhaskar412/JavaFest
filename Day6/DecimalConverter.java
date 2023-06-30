import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Please enter a Decimal number to convert : ");
            int num = scn.nextInt();
            //System.out.println("");
            System.out.println("1.Binary Format ");
            System.out.println("2.Octal Format");
            System.out.println("3.Hexadecimal Format");
            System.out.println("Please select one of the above option "); //       "Please select any of the above'");
            int type = scn.nextInt();
            switch (type) {
                case 1:
                    System.out.println("Binary Format Code is : " + Integer.toBinaryString(num));
                    break;
                case 2:
                    System.out.println("Octal Format Code is : " + Integer.toOctalString(num));
                    break;
                case 3:
                    System.out.println("HexaDecimal Format Code is : " + Integer.toHexString(num));
                    break;
                default:
                    System.out.println("Please enter valid option");
            }

            System.out.println("Do you want to perform convertion again? (Y/y)");
            ch = scn.next();

        } while ((ch.equals("y")) || (ch.equals("Y") ));

    }
}
