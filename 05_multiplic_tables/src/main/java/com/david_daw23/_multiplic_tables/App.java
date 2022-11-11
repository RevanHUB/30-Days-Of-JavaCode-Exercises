package com.david_daw23._multiplic_tables;

import java.util.Scanner;

/**
 * @author REVAN
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Please, introduce the number to calculate the multiplication table, exponent and factorial: ");
        Scanner request = new Scanner( System.in );
        Integer num = request.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
             System.out.println("Exponent: " + num + "^" + i +  " = " + Math.pow(num, i));
        }
        Integer acc = 1;
        for (int i = 1; i <= num; i++) {
                acc = acc * i;
        }
        System.out.println("Factorial: " + acc);
        
        
    }
}
