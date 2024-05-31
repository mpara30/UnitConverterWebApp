package calculation;

public class SpeedCalculation {
    public static double calculateMphToKph(double mph){
        return mph * 1.609344;
    }

    public static double calculateMphToKnots(double mph){
        return mph / 1.150779;
    }

    public static double calculateMphToMach(double mph){
        return mph / 761.207;
    }

    public static double calculateKphToMph(double kph){
        return kph / 1.609344;
    }

    public static double calculateKphToKnots(double kph){
        return kph / 1.852;
    }

    public static double calculateKphToMach(double kph){
        return kph / 1225.044;
    }

    public static double calculateKnotsToMph(double knots){
        return knots * 1.150779;
    }

    public static double calculateKnotsToKph(double knots){
        return knots * 1.852;
    }

    public static double calculateKnotsToMach(double knots){
        return knots / 661.4708;
    }

    public static double calculateMachToMph(double mach){
        return mach * 761.207;
    }

    public static double calculateMachToKph(double mach){
        return mach * 1225.044;
    }

    public static double calculateMachToKnots(double mach){
        return mach * 661.4708;
    }
}
