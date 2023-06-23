import javax.swing.plaf.synth.SynthSplitPaneUI;

public class StringCapitalize {

    public static void main(String[] args) {

        String input = "good morning bhaskar";
        String[] split = input.split(" ");
	
	System.out.println("input String is : "+input);
        String string = "";
        for (String s : split
        ) {
            String s3 = s.substring(0, 1).toUpperCase() + s.substring(1);
            string = string + s3 + " ";
            
        }

        System.out.println("Capialized each word string is : "+string.trim());
    }
}
