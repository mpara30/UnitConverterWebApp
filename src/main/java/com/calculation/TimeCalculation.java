package com.calculation;

public class TimeCalculation {

    public static Double calculateSecondsToMinutes(Double seconds){
        return seconds / 60;
    }

    public static Double calculateSecondsToHours(Double seconds){
        return seconds / 3600;
    }

    public static Double calculateSecondsToDays(Double seconds){
        return seconds / 86400;
    }

    public static Double calculateMinutesToSeconds(Double minutes){
        return minutes * 60;
    }

    public static Double calculateMinutesToHours(Double minutes){
        return minutes / 60;
    }

    public static Double calculateMinutesToDays(Double minutes){
        return minutes / 1440;
    }

    public static Double calculateHoursToSeconds(Double hours){
        return hours * 3600;
    }

    public static Double calculateHoursToMinutes(Double hours){
        return hours * 60;
    }

    public static Double calculateHoursToDays(Double hours){
        return hours / 24;
    }

    public static Double calculateDaysToSeconds(Double days){
        return days * 86400;
    }

    public static Double calculateDaysToMinutes(Double days){
        return days * 1440;
    }

    public static Double calculateDaysToHours(Double days){
        return days * 24;
    }
}
