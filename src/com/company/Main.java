package com.company;

import java.util.Scanner;

public class Main {
    private static String occupiedSpaces= "A1 H6 C3 D1 E4";
    private static String place;
    public static void FindPlace(String enteredPlace) {
        place = enteredPlace;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your place: ");
        String place = scanner.nextLine();
        //Adding comment just for commit
        // Going just fine. Lets try another one
        FindPlace(place);
    }
}
