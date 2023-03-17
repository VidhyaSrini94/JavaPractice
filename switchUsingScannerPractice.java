package practice.mar11;

import java.util.Scanner;

public class switchUsingScannerPractice {
    public static void main(String[] args) {
        String days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of the day");
        days = scanner . next();

        switch (days){
            case "Monday":
                System.out.println("you have entered the first day of the week"); break;
            case "Tuesday":
                System.out.println("you have entered the Second day of the week"); break;
            case "Wednesday":
                System.out.println("you have entered the third day of the week"); break;
            case "Thursday":
                System.out.println("you have entered the fourth day of the week"); break;
            case "Friday":
                System.out.println("you have entered the fifth day of the week"); break;
            case "Saturday":
                System.out.println("you have entered the sixth day of the week"); break;
            case "Sunday":
                System.out.println("you have entered the seventh day of the week"); break;
            default:
                System.out.println("Please enter the correct day"); break;

        }
    }
}
