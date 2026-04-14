package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name below:");
        System.out.print("\nFirst Name: ");
        String fullName = scanner.nextLine().trim();
        System.out.print("\nMiddle Name: ");
        fullName += " " + scanner.nextLine().trim();
        System.out.print("\nLast Name: ");
        fullName += " " + scanner.nextLine().trim();
        System.out.print("\nSuffix: ");
        fullName += ", " + scanner.nextLine().trim();

        System.out.println(fullName.trim());
    }
}
