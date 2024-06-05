package com.calculation;

public class SpeedCalculation {
    public static Double calculateMphToKph(Double mph){
        return mph * 1.609344;
    }

    public static Double calculateMphToKnots(Double mph){
        return mph / 1.150779;
    }

    public static Double calculateMphToMach(Double mph){
        return mph / 761.207;
    }

    public static Double calculateKphToMph(Double kph){
        return kph / 1.609344;
    }

    public static Double calculateKphToKnots(Double kph){
        return kph / 1.852;
    }

    public static Double calculateKphToMach(Double kph){
        return kph / 1225.044;
    }

    public static Double calculateKnotsToMph(Double knots){
        return knots * 1.150779;
    }

    public static Double calculateKnotsToKph(Double knots){
        return knots * 1.852;
    }

    public static Double calculateKnotsToMach(Double knots){
        return knots / 661.4708;
    }

    public static Double calculateMachToMph(Double mach){
        return mach * 761.207;
    }

    public static Double calculateMachToKph(Double mach){
        return mach * 1225.044;
    }

    public static Double calculateMachToKnots(Double mach){
        return mach * 661.4708;
    }
}
