package com.david_daw23._fibonacci_levels;

import java.util.Scanner;

/**
 * @author REVAN
 */
public class App {

    public static void main(String[] args) {
        Scanner r = new Scanner( System.in );
        System.out.println("Fibonacci normal: ");
        Integer height = r.nextInt();
        Integer count0 = 0;
        for (int levels = 0; levels < height; levels++) {
             for (int steps = 0; steps <= levels; steps++) {
                      System.out.print("#");
             }
              for (int interspace = 0; interspace < Math.floor((height - count0) +1 / 2)  ; interspace++) {
                         System.out.print(" ");
             }
                System.out.println(" ");
        }
        
        System.out.println("Piramide centrada: ");
        Integer count = 0;
        for (int levels = 0; levels < height; levels++) {
            count ++;
           // System.out.print(count + ")" ) ;
            for (int interspace = 0; interspace < Math.floor((height - count) +1 / 2)  ; interspace++) {
                         System.out.print(" ");
             }
             for (int steps = 0; steps <= levels; steps++) {
                      System.out.print("#");
             }
             for (int steps = 0; steps <= levels; steps++) {
                      System.out.print("#");
             }
              for (int interspace = 0; interspace < Math.floor((height - count) +1 / 2)  ; interspace++) {
                         System.out.print(" ");
             }
                System.out.println(" ");
              
        }
    }
}
