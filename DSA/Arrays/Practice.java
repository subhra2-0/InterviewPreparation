package Arrays;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        String str1 = "dfdddfffdssds";
        Set<Character> unique = new HashSet<>();
        Map<Character,Long> dupSentence = str1.chars().mapToObj(x->(char)x).filter(x->!unique.add(x)).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(dupSentence);


    }
}
