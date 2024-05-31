package calculation;

public class TimeCalculation {

    public static double calculateSecondsToMinutes(double seconds){
        return seconds / 60;
    }

    public static double calculateSecondsToHours(double seconds){
        return seconds / 3600;
    }

    public static double calculateSecondsToDays(double seconds){
        return seconds / 86400;
    }

    public static double calculateMinutesToSeconds(double minutes){
        return minutes * 60;
    }

    public static double calculateMinutesToHours(double minutes){
        return minutes / 60;
    }

    public static double calculateMinutesToDays(double minutes){
        return minutes / 1440;
    }

    public static double calculateHoursToSeconds(double hours){
        return hours * 3600;
    }

    public static double calculateHoursToMinutes(double hours){
        return hours * 60;
    }

    public static double calculateHoursToDays(double hours){
        return hours / 24;
    }

    public static double calculateDaysToSeconds(double days){
        return days * 86400;
    }

    public static double calculateDaysToMinutes(double days){
        return days * 1440;
    }

    public static double calculateDaysToHours(double days){
        return days * 24;
    }
}
