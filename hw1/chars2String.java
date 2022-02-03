package hw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class chars2String {
    public static String charsToString(List<Character> lst){
        String s = lst.stream().collect(
                StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        return s;
    }

    public static void main(String[] args) {
    List<Character> lst = Arrays.asList('a', 'p', 'p', 'l','e');
        System.out.println(lst);
        System.out.println(charsToString(lst));
    }
}
