import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLogics {

    public static void main(String[] args) {
        String s = "I like to read about Java and also practice some Java Programs everyday";

        System.out.println("------Character/word Count based on regex--------");
        // Below Logic will count characters for regex("") and words for regex(" ")
        Map<String, Long> collect = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        System.out.println("---------Longest substring------------");

        Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).stream().forEach(System.out::println);


    }
}
