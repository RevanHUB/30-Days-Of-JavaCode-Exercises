/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.david_daw23._coin;

import java.util.Random;

/**
 * @author REVANHUB
 */
public class Coin {
    
    private String tossACoin() {
        Random rand = new Random();
        Integer toss = Math.abs(rand.nextInt()) % 2;
        if(toss == 0) return "heads"; else return "tails";
    }
    
    public static void main(String[] args) {
        Coin newCoin = new Coin();
        System.out.println(newCoin.tossACoin());
    }
}
