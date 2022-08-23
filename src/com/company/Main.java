package com.company;

public class Main {

    public static void main(String[] args) {
        // HW 2
        int A = 2;
        int B = 2;

        int s;
        if (A == B)
            s = (A + B) * (A + B);
        else
            s = A + B;

        System.out.println(s);


        // HW 3
        // 2.1
        /*for (int i = 10; i <= 37; i = i + 3)
            System.out.println (i);*/

        // 2.2
        /*for (int i = 998; i >= 900; i = i - 2)
            System.out.println (i);*/

        // 2.3
        /*int a;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1)
                a = 1;
            else
                a = -1;
            System.out.println (a);*/

        // 2.4
        int a;
        for (int i = 1; i <= 60; i++) {
            if (i % 3 == 0)
                a = 9;
            else
                a = 7;
            System.out.println(a);
        }


        // HW 4
        int T = 17;
        String action = "";

        if (T < 17)
            action = "hit";
        else if (T >= 17 && T <= 21)
            action = "stay";
        else
            action = "bust";

        System.out.println(action);


        // HW 5
        final int A = 23;
        final int B = 123;
        int output = 0;

        // 5.1
        /*if (A >= 100) {
            if (B <= 50)
                output = 1;
            else
                output = 0;
        }
        System.out.println (output);*/

        // 5.2
        if (A >= 100) {
            if (B <= 50)
                output = 1;
        } else if (B >= 100) {
            if (A <= 50)
                output = 1;
        }
        System.out.println(output);


        // HW 6
        final int w = 11;
        int price = 0;
        int price_5kg = 3 + (5 - 2) * 2;

        if (w <= 2)
            price = 3;
        else if (w > 5)
            price = price_5kg + (w - 5) * 3;
        else
            price = 3 + (w - 2) * 2;

        System.out.println(price + "€");


        // HW 7
        int n = 1;
        boolean found = false;

        while (!found) {
            int val = (n * n * n + 91) % 47;
            if (val == 0) {
                found = true;
                System.out.println(n);
            } else
                n++;
        }


        // HW 8
        // 8.1
        /*final int a = 15;
        int c = 1;
        int result = 3;
        while (c < a) {
            result = result * 3;
            c++;
        }
        System.out.println (result);*/

        // 8.2
        final int a = 3;
        final int b = 3;
        int c = 1;
        int result = 1;
        while (c <= a) {
            result = result * b;
            c++;
        }
        System.out.println(result);


        // HW 9
        int t = 0;
        int decrease;
        int highest_decrease = 0;
        int time_of_highest_decrease = 0;
        int number_of_previous_bacteria = t * (t - 20) * (t - 100) + 120000;
        t++;

        while (t <= 100) {
            int number_of_bacteria = t * (t - 20) * (t - 100) + 120000;
            decrease = number_of_previous_bacteria - number_of_bacteria;
            if (decrease > highest_decrease) {
                highest_decrease = decrease;
                time_of_highest_decrease = t;
            }
            System.out.println (t + "     " + decrease);
            t++;
            number_of_previous_bacteria = number_of_bacteria;
        }
        System.out.println ("The time at which the decrease from the previous hour is the highest: " + time_of_highest_decrease);


        // HW 10
        int a = 9;
        int b = 6;
        int r = (a % b);

        while (r != 0) {
            a = b;
            b = r;
            r = (a % b);
        }

        System.out.println ("The greatest common divisor is: " + b);
    }
}
