package com.streams;

import java.util.stream.IntStream;

public class IntStreamIterate {

    public void intStreamIterateOverPople(){
        IntStream.iterate(0, i -> ++i).limit(10).filter(i -> i%2==0).forEach(System.out::println);
    }

    public static void main(String[] args){
        IntStreamIterate isi = new IntStreamIterate();
        isi.intStreamIterateOverPople();
    }
}
