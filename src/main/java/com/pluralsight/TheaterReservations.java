package com.pluralsight;

import java.util.Scanner;

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
        String numTickets = scanner.nextLine().trim();

    }
}
