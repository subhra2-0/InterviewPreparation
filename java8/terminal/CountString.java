package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        String [] names = {"Subhrajit","Digvijay","Arjun","Ravi"};
        List<String> names1 =Arrays.asList(names);
       List<String> collectionNames= names1.stream().filter(x->x.length()>6).collect(Collectors.toList());
        System.out.println(collectionNames);


    }
}
