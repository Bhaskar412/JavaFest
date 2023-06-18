public class SwitchWithoutDefault{

public static void main(String... args){

int match = 8;
//int match = 2;

	switch(match){
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

	// If default clause is not present in switch block, if the condition doesn't match with any case it will come out of Switch block.
	// Default is optional,but it should be there to specify whether the condiction is matching with any case or not

}
		System.out.print("Out of Switch Block");

}

}
