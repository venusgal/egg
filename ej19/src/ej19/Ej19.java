/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19;

import java.util.Scanner;
public class Ej19 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] ma = new int[3][3];
        int[][] ma2= new int[3][3];
        int c = 0;
        System.out.println("Ingrese datos para matriz [3][3]");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ma[i][j] = scan.nextInt();
                ma2[j][i] = ma[i][j]*-1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ma[i][j] == (ma2[j][i])) {
                    c++;
                }
                System.out.print("[" + ma[i][j] + "]");
            }
            System.out.println("");
}
        System.out.println("----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + ma2[i][j] + "]");
            }
            System.out.println("");
        }

        if (c == ma.length) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
}
