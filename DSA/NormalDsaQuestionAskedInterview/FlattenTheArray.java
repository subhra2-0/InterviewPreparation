package NormalDsaQuestionAskedInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenTheArray {

    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
        Integer arr[] = flattenArray(array);

        System.out.println(Arrays.toString(arr));

    }

    public static Integer[] flattenArray(Object arr[]) {
        List<Integer> resultList = new ArrayList<>();
        for (Object elements : arr) {
            if (elements instanceof Object[]) {
                resultList.addAll(List.of(flattenArray((Object[]) elements)));

            } else {
                resultList.add((Integer) elements);

            }


        }
        return resultList.toArray(new Integer[resultList.size()]);
    }
}



