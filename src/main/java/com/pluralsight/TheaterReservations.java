package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // need a name, a date & # tickets
        System.out.println("Welcome To Theater Reservations!\n");
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine().trim();
        System.out.print("Enter date of show you are attending (MM/dd/yyy): ");
        String showDate = scanner.nextLine().trim();
        System.out.print("How many tickets are needed? ");
        int numTickets = scanner.nextInt();


        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate today = LocalDate.parse(showDate, format);
        String[] splitInput = fullName.split(Pattern.quote(" "));
        String firstName = splitInput[0];
        String lastName = splitInput[1];

        if (numTickets == 1){
            System.out.println(numTickets + " Ticket reserved for " + showDate + " under " + lastName + ", " + firstName);

        }else{
            System.out.println(numTickets + " Tickets reserved for " + showDate + " under " + lastName + ", " + firstName);
        }


    }
}
