import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ListWithLoops{

public static void main(String... args){

	List names = new ArrayList();
	names.add("Bhaskar");
	names.add("Raju");
	names.add("Prasad");
	names.add("Malli");

	System.out.println("---------for loop----------");
	for(int i=0; i<names.size(); i++)
		System.out.println("Name in the List at index "+i+" is : "+names.get(i));

	System.out.println("---------while loop----------");
	int size=names.size();
	int i=0;
	while(i<size){
		System.out.println("Name in the List at index "+i+" is : "+names.get(i));
		i++;	
}
	System.out.println("--------- Do-while loop----------");
	int size1=names.size();
	int j=0;
	do{
		System.out.println("Name in the List at index "+j+" is : "+names.get(j));
		j++;	
	}while(j<size1);

	System.out.println("--------- Loops using Iterator----------");

//Iterator is an object which is used for iteration/traversal of Collection like ArraList,HashSet..
//provided by the utility method iterator();

	Iterator iterator = names.iterator();
	while(iterator.hasNext())
		System.out.println(iterator.next());

	

}
}