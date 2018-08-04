package com.streams;

import java.util.List;

public class FindMaxOfStream {
    public int findMaxOfAges(List<Integer> agesList){
       return agesList.stream().max((n1,n2)-> n1>n2? 1 : -1).get();
    }

    public static void main(String[] args){
        FindMaxOfStream fs = new FindMaxOfStream();
        System.out.println(fs.findMaxOfAges(MockData.peopleAge));
    }
}
