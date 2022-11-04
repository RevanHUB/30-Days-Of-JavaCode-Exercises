/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.david_daw23._guess_a_number;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author RAVE
 */
public class App {
    public Integer random = (int) (Math.random()*(10 - 1)) + 1; // * 10 max and + 1 min
    public Integer trys = 3;
    
    public Integer getNumber() {
        Scanner request = new Scanner(System.in);
        System.out.println("Introduce the number!");
        Integer value = request.nextInt();
        return value;
    }
    public Integer myRandomValue() {
        return this.random;
    }
    public Boolean compareNumbers(Integer num) {
        this.trys = this.trys - 1;
        if (this.trys >= 0) {
            if(Objects.equals(this.random, num)) System.out.println("Congratz! you won!"); else System.out.println("Oops! You didnt guess the number, you have " + this.trys + " more oportunities");
        }
        Boolean result = (Objects.equals(this.random, num))? true : false;
        if (this.trys == 0) System.out.println("You lost the game!");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Guess a Number APP!");
        System.out.println("---------------------");
        App game = new App();
        Integer num = game.getNumber();
        Boolean comprobation = game.compareNumbers(num);
        while (comprobation != true && game.trys > 0) {
            num = game.getNumber();
            comprobation = game.compareNumbers(num);
        }
        
    }
}
