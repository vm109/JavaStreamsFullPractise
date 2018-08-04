package com.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesInStream {
public List<Integer> findDistinct(List<Integer> nonDistinctArrayList){
    return nonDistinctArrayList.stream().distinct().collect(Collectors.toList());
}

public Set<Integer> findDistinctWithSet(List<Integer> nonDistinctArray){

    return nonDistinctArray.stream().collect(Collectors.toSet());
}

public static void main(String[] args){
    FindDuplicatesInStream fds = new FindDuplicatesInStream();
    System.out.println("with list");
    fds.findDistinct(MockData.netWorth).forEach(System.out::println);
    System.out.println("with set");
    fds.findDistinctWithSet(MockData.netWorth).forEach(System.out::println);
}
}
