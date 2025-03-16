package com.Practice;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ParkingChargeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        
        System.out.print("Enter In-Time  ");
        String inTimeStr = scanner.nextLine();
        System.out.print("Enter Out-Time ");
        String outTimeStr = scanner.nextLine();

        try {
           
            LocalDateTime inTime = LocalDateTime.parse(inTimeStr, formatter);
            LocalDateTime outTime = LocalDateTime.parse(outTimeStr, formatter);

            
            if (inTime.isAfter(outTime)) {
                System.out.println("Error: Out-Time must be after In-Time.");
               
            }

            Duration duration = Duration.between(inTime, outTime);

            long totalMinutes = duration.toMinutes();
            long hours = totalMinutes / 60;
            long minutes = totalMinutes % 60;

            
            int parkingCharges = (int) (hours * 10); 
            if (minutes > 0) {
                parkingCharges += 10; 
            }

           
            System.out.println("Total parking fee: " + parkingCharges + " Rupees");
        } catch (Exception e) {
            System.out.println("Error: ");
        }
        
    }
}

