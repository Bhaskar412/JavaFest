import java.util.Arrays;

public class StringDemo{

    public static void main(String[] args){

        String sentence1 = new String("The quick brown fox jumps over the lazy dog");
        String sentence2 = new String("Brown fox jumps");
        String sentence3 = "The quick brown fox jumps over the lazy dog    ";
	String sentence4 = new String("The Quick BRown fox jumps over the lazy dog");

        System.out.println("sentence1 is : "+sentence1);
	System.out.println("sentence2 is : "+sentence2);
	System.out.println("sentence4 is : "+sentence4);

        System.out.println("sentence1 contains - quick : "+sentence1.contains("quick"));
        System.out.println("sentence1 starts with - Te: "+sentence1.startsWith("Te"));
        System.out.println("sentence1 equals to sentence2 : "+sentence1.equals(sentence2));
        System.out.println("sentence1 equals ignore case with sentence4 is : "+sentence1.equalsIgnoreCase(sentence4));
        String[] split = sentence1.split(" ");
        System.out.println("--sentence is splitted into array of words divided by space---");
        Arrays.stream(split).forEach((s)-> System.out.println(s));
        System.out.println("--------end of words---------");
        System.out.println(sentence3+"-there are spaces at the end of the sentence");
        System.out.println(sentence3.trim()+"-the sapaces at the end of the string is removed by trim method");
        System.out.println(sentence2.toLowerCase()+"-sentence is converted to lower case");
        System.out.println(sentence2.toUpperCase()+"-sentence is converted to upper case");
        
    }

}/* Assignments - Practice a few other String API methods
                - contains()
		- startsWith(char)
		- endsWith(char)
		- equals(String)
		- equalsIgnoreCase(String)
		- trim()
		- split(regex)
		- toUpperCase()
		- toLowerCase()
		- replace(oldChar, newChar)*/