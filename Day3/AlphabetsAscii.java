public class AlphabetsAscii{

public static void main(String[] Args){

char[] lowerCaseAlphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

for(int i=0; i<lowerCaseAlphabets.length; i++)
System.out.println("Ascii value of "+lowerCaseAlphabets[i]+" is : "+(int)lowerCaseAlphabets[i] );

System.out.println("---------------------------");

char[] upperCaseAlphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

for(int i=0; i<upperCaseAlphabets.length; i++)
System.out.println("Ascii value of "+upperCaseAlphabets[i]+" is : "+(int)upperCaseAlphabets[i] );

}

}