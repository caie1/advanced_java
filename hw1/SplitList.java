package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SplitList {
    private static List<Integer> IndexedInteger(List<Integer> lst, int flag){
        // flag: odd=1, even=0
        List<Integer> IndexedIntegers = IntStream
                .range(0, lst.size())
                .filter(i -> i%2 == flag)
                .mapToObj(i -> lst.get(i))
                .collect(Collectors.toList());
        return IndexedIntegers;
    }

    public static List<List<Integer>> splitList(List<Integer> lst){
        List<Integer> oddList = IndexedInteger(lst, 1);
        List<Integer> evenList = IndexedInteger(lst, 0);
        return Arrays.asList(oddList, evenList);
//        Map<Boolean, List<Integer>> groups = lst.stream()
//                .collect(Collectors.partitioningBy(i -> i>6));
//        List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
//        System.out.println(subSets);
//        return Arrays.asList(groups.get(true),groups.get(false));
    }
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3,4,67,8,0,123);
        System.out.println(splitList(lst));
    }
}
