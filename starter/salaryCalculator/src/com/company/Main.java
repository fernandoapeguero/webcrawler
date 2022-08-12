package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Double yearlySalary = salaryCalculator(40, 15.0, 0);

        System.out.println(yearlySalary);

        if(args.length > 0) {
            for (String message: args){
                System.out.println(message);
                System.out.println(Arrays.toString(message.getBytes(StandardCharsets.UTF_8)).length());
            }
        }
    }

    public static Double salaryCalculator(int hoursPerWeek, Double payPerHour, int vacationsDaysTaken){


        double weeklySalary = hoursPerWeek * payPerHour;

        double vacationsDeductionFromSalary = (vacationsDaysTaken * 8) * payPerHour;

        return weeklySalary * 4 * 12 - vacationsDeductionFromSalary;

    }
}
