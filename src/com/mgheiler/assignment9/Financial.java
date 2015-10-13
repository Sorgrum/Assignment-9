package com.mgheiler.assignment9;

public class Financial {
    public static double loanAmountRequired(double amount, double rate, int time) {
        // Returns the monthly payments
        return amount * ((rate/12)*(Math.pow((1 + (rate/12)), time))) / (Math.pow((1 + (rate/12)), time) - 1);
    }

    public static void printBalanceAfterLoanPaymentsTable(double amount, double rate, int time) {
        // Print a table with the balance owed after i many payments
        double balanceRemaining = 0;
        for (int i = 0; i <= time; i++) {
            double top = Math.pow(1 + (rate/12), time) - Math.pow(1 + (rate/12), i);
            double bottom = Math.pow(1 + (rate/12), time) - 1;
            //balanceRemaining = amount * ((Math.pow(1 + (rate/12), time) - Math.pow(1 + (rate/12), i - 1)) / (Math.pow(1 + rate, time) - 1));
            if (i < 10) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
            System.out.print(" | " + (top / bottom) * amount + "\n");
        }

    }
}
