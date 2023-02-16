package scanner;

import java.util.Scanner;

public class noofdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterthe former year: ");
        int fy = sc.nextInt();
        System.out.println("Enter the current Year: ");
        int cy = sc.nextInt();
        if (cy > fy) {
            System.out.println("in the list of years: ");
            for (int i = fy; i <= cy; i++) {
                System.out.println("The year " + i + " numberofdays " + numberofday(i));
            }

        } else {

            System.out.println("write the correct year:? ");
        }
    }

        static int numberofday ( int year){
            if (leapyear(year))
            return 366;



        else
            return 365;

        }

     static boolean leapyear(int year) {
        return(year % 4== 0 && year % 100 != 0);
    }





}