/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package vu.telecombillingsystem;
import java.util.Scanner;

public class TelecomBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PART (c): TELECOM BILLING SYSTEM ===");
        System.out.println("Billing Rules:");
        System.out.println("- 10% charge on loaded airtime");
        System.out.println("- UGX 200 per second for calls");
        
        // Constants from the problem
        final double AIRTIME_CHARGE_RATE = 0.10; // 10%
        final int CALL_RATE_PER_SECOND = 200;    // UGX 200 per second
        
        // Get user input
        System.out.print("\nEnter amount of airtime loaded (UGX): ");
        double airtimeLoaded = input.nextDouble();
        
        System.out.print("Enter call duration in minutes: ");
        int callMinutes = input.nextInt();
        
        // Calculate charges
        double airtimeCharge = airtimeLoaded * AIRTIME_CHARGE_RATE;
        int callDurationSeconds = callMinutes * 60;
        double callCharge = callDurationSeconds * CALL_RATE_PER_SECOND;
        
        // Calculate total deductions and balance
        double totalDeductions = airtimeCharge + callCharge;
        double remainingBalance = airtimeLoaded - totalDeductions;
        
        // Ensure balance doesn't go negative
        if (remainingBalance < 0) {
            remainingBalance = 0;
            System.out.println("Warning: Insufficient balance for the call!");
        }
        
        // Display detailed bill
        System.out.println("\n=== BILLING DETAILS ===");
        System.out.printf("Airtime loaded:          UGX %,.2f%n", airtimeLoaded);
        System.out.printf("Airtime charge (10%%):    UGX %,.2f%n", airtimeCharge);
        System.out.printf("Call duration:           %d minutes (%d seconds)%n", 
                         callMinutes, callDurationSeconds);
        System.out.printf("Call charge:             UGX %,.2f%n", callCharge);
        System.out.printf("Total deductions:        UGX %,.2f%n", totalDeductions);
        System.out.printf("Remaining balance:       UGX %,.2f%n", remainingBalance);
        
        // Specific scenario from the question
        System.out.println("\n--- SPECIFIC SCENARIO FROM QUESTION ---");
        System.out.println("User loads UGX 10,000 and calls for 5 minutes");
        
        airtimeLoaded = 10000;
        callMinutes = 5;
        
        airtimeCharge = airtimeLoaded * AIRTIME_CHARGE_RATE;
        callDurationSeconds = callMinutes * 60;
        callCharge = callDurationSeconds * CALL_RATE_PER_SECOND;
        totalDeductions = airtimeCharge + callCharge;
        remainingBalance = airtimeLoaded - totalDeductions;
        
        System.out.println("Airtime loaded:          UGX 10,000.00");
        System.out.printf("Airtime charge (10%%):    UGX %,.2f%n", airtimeCharge);
        System.out.printf("Call charge (5 mins):    UGX %,.2f%n", callCharge);
        System.out.printf("Total deductions:        UGX %,.2f%n", totalDeductions);
        System.out.printf("Remaining balance:       UGX %,.2f%n", remainingBalance);
        
        input.close();
    }
}
