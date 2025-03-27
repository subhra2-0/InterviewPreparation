package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8racticeTerminal {
    public static void main(String[] args) {

        Integer arr[] = {12,21,18,11,4,8,13};

        List<Integer> list = Arrays.asList(arr);

       int total= list.stream().reduce(0,(a,b)->a+b);
       System.out.println(total);


    }
}
