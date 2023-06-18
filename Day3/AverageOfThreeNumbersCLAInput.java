public class AverageOfThreeNumbersCLAInput{
	public static void main(String... args){


	//Printing the Command Line Arguments Input
	System.out.println("Command line inputs are : ");
	for(int i=0; i<args.length; i++)
	System.out.println(args[i]);

	//Converting Command Line Arguments input to Integer type to perform Arithmatic Operations
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	
	int sum=a+b+c;
	float av = (float) sum/3;

	System.out.println("Sum of three marks is : "+sum);
	System.out.println("Average of three marks is : "+av);	

}
}