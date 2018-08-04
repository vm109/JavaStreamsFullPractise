package com.streams;

import java.util.stream.IntStream;

public class IntRangeExample1 {

    public void printPeopleWithIntStream(){
        IntStream.range(0,MockData.people.length).forEach(x-> System.out.println(MockData.people[x]));
    }

    public static void main(String[] args){
        IntRangeExample1 ir = new IntRangeExample1();
        ir.printPeopleWithIntStream();
    }
}
