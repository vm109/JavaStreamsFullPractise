package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamAndCollect1 {

    public void printListOfStateCapitalsWithLetter(List<String> stateCapitals, char letter){
        stateCapitals.stream().filter(x -> Character.toLowerCase(x.toCharArray()[0])==Character.toLowerCase(letter)).collect(Collectors.toList()).forEach(x -> System.out.println(x));
    }

    public static void main(String[] args){
        SimpleStreamAndCollect1 ssc = new SimpleStreamAndCollect1();
        String[] arrOfCapitals = {"Hyderabad","bangalore","Chennai","Chester","Bankok","port blair","santa barbara","santa clara","LA","Las Vegas"};
        ssc.printListOfStateCapitalsWithLetter(Arrays.asList(arrOfCapitals),'b');
    }
}
