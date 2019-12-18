package com.company;

import java.util.Scanner;

public class Main {

    public static void FindPlace(String enteredPlace) {
        place = enteredPlace;
        if (occupiedSpaces.contains(place)) {
            System.out.println("This place is already occupied");
        } else {
            System.out.println("You can take it its free");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your place: ");
        String place = scanner.nextLine();
        //Adding comment just for commit
        // Going just fine. Lets try another one
    }
}
