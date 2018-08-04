package com.streams;

import java.util.List;

public class FindMinOfStream {

    public int minAgeOfGivenAges(List<Integer> ages){
        return ages.stream().min((n1,n2) -> n1<n2? -1 :1).get();
    }

    public static void main(String[] args){
        FindMinOfStream fs = new FindMinOfStream();
        System.out.println(fs.minAgeOfGivenAges(MockData.peopleAge));
    }

}
