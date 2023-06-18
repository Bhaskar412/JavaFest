import java.util.Scanner;

public class AverageOfThreeNumbersScannerInput{
	public static void main(String... args){

	Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the marks of three subjects");
	System.out.print("Please enter Maths subject marks : ");
	int marks1 = scn.nextInt();
	System.out.print("Please enter Science subject marks : ");
	int marks2 = scn.nextInt();
	System.out.print("Please enter Social subject marks : ");
	int marks3 = scn.nextInt();
	
	int sum=marks1+marks2+marks3;
	float av = (float) sum/3;

	System.out.println("Sum of "+marks1+" + "+marks2+" + "+marks3+" is : "+sum);
	System.out.println("Average of "+marks1+" + "+marks2+" + "+marks3+" is : "+av);	

}
}