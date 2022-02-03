package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitList {
    public static List<List<Integer>> splitList(List<Integer> lst){
        Map<Boolean, List<Integer>> groups = lst.stream()
                .collect(Collectors.partitioningBy(i -> i>6));
        List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
        System.out.println(subSets);
        return Arrays.asList(groups.get(true),groups.get(false));
    }
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3,4,67,8,0,123);
        System.out.println(splitList(lst));
    }
}
