package com.streams;

import java.util.HashMap;
import java.util.List;

public class FilterWithStreams {

    public double computeAverage(List<Double> carPrices){

       return carPrices.stream().mapToDouble(Double::intValue).average().getAsDouble();
    }

    public static void main(String[] args){
        FilterWithStreams fws = new FilterWithStreams();
        System.out.println(fws.computeAverage(MockData.carPricesList));
    }
}
