package com.calculation;

public class WeightCalculation {
    public static Double calculateMilligramToGram(Double milligram){
        return milligram / 1000;
    }

    public static Double calculateMilligramToKilogram(Double milligram){
        return milligram / 1000000;
    }

    public static Double calculateMilligramToTons(Double milligram){
        return milligram * 0.0000000011023;
    }

    public static Double calculateMilligramToOunce(Double milligram){
        return milligram * 0.000035274 ;
    }

    public static Double calculateMillitgamToPound(Double milligram){
        return milligram * 0.0000022046;
    }

    public static Double calculateGramToMilligram(Double gram){
        return gram * 1000;
    }

    public static Double calculateGramToKilogram(Double gram){
        return gram / 1000;
    }

    public static Double calculateGramToTons(Double gram){
        return gram / 1000000;
    }

    public static Double calculateGramToOunce(Double gram){
        return gram * 0.035274;
    }

    public static Double calculateGramToPound(Double gram){
        return gram / 453.59237;
    }

    public static Double calculateKilogramToMilligram(Double kilogram){
        return kilogram * 1000000;
    }

    public static Double calculateKilogramToGram(Double kilogram){
        return kilogram * 1000;
    }

    public static Double calculateKilogramToTon(Double kilogram){
        return kilogram / 1000;
    }

    public static Double calculateKilogramToOunce(Double kilogram){
        return kilogram / 0.02834952;
    }

    public static Double calculateKilogramToPound(Double kilogram){
        return kilogram * 2.2046;
    }

    public static Double calculateTonToMilligram(Double ton){
        return ton / 0.0000000010000;
    }

    public static Double calculateTonToGram(Double ton){
        return ton * 1000000;
    }

    public static Double calculateTonToKilogram(Double ton){
        return ton * 1000;
    }

    public static Double calculateTonToOunce(Double ton){
        return ton * 35274;
    }

    public static Double calculateTonToPound(Double ton){
        return ton / 0.00045359237;
    }

    public static Double calculateOunceToMilligram(Double ounce){
        return ounce / 0.000035274;
    }

    public static Double calculateOunceToGram(Double ounce){
        return ounce / 0.035274;
    }

    public static Double calculateOunceToKilogram(Double ounce){
        return ounce / 35.274;
    }

    public static Double calculateOunceToTon(Double ounce){
        return ounce / 35274;
    }

    public static Double calculateOunceToPound(Double ounce){
        return ounce * 0.0625;
    }

    public static Double calculatePoundToMilligram(Double pound){
        return pound / 0.0000022046;
    }

    public static Double calculatePoundToGram(Double pound){
        return pound / 0.0022046;
    }

    public static Double calculatePoundToKilogram(Double pound){
        return pound / 2.2046;
    }

    public static Double calculatePoundToTon(Double pound){
        return pound / 2000;
    }

    public static Double calculatePoundToOunce(Double pound){
        return pound * 16;
    }

}
