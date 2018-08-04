package com.imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example1FindPeopleByAge {

    public static void main(String[] args){
        Integer[] people = {18,20,18,20,30,45,88,18,10,3,19};
        List<Integer> mockPeople = Arrays.asList(people);
        Iterator<Integer> it = mockPeople.iterator();
        int count=0;
        while(it.hasNext()){
            it.next();
            if(count<10){
            count++;
            }
        }

        System.out.println(count);
    }
}
