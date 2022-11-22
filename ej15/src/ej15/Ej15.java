/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;
import java.util.Scanner;
/**
 *
 * @author Windows 10 Pro
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        int[][] num = new int[3][3];
        int fila = 0;
        int diag = 0;
        int diag2 = 0;
        int hor = 0;
        int c=0;
        System.out.println("Ingrese datos para matriz [3][3]");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = scan.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diag += num[i][j];
                }
                if (i + j == 2) {
                    diag2 += num[i][j];
                }
            }
        }
        if (diag==diag2){
            c++;
        }
        for (int i = 0; i < 3; i++) {
            fila = 0;
            for (int j = 0; j < 3; j++) {
                fila += num[i][j];
            }
            if (diag == fila) {
                c++;
            } 
        }
        for (int j = 0; j < 3; j++) {
            hor = 0;
            for (int i = 0; i < 3; i++) {
                hor += num[i][j];
            }
            if (diag == hor) {
                c++;
            } 
        }
        if (c==7){
            System.out.println("La Matriz es Magica!");
        }
    }
}
//}
////public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        int[][] num = new int[3][3];
////        int fila = 0;
////        int diag = 0;
////        int diag2 = 0;
////        int hor = 0;
////        int c=0;
////        System.out.println("Ingrese datos para matriz [3][3]");
////
////        for (int i = 0; i < 3; i++) {
////            for (int j = 0; j < 3; j++) {
////                num[i][j] = scan.nextInt();
////
////            }
////        }
////        for (int i = 0; i < 3; i++) {
////            for (int j = 0; j < 3; j++) {
////                if (i == j) {
////                    diag += num[i][j];
////                }
////                if (i + j == 2) {
////                    diag2 += num[i][j];
////                }
////            }
////        }
////}if (diag==diag2){
//            c++;
//        }
//        for (int i = 0; i < 3; i++) {
//            fila = 0;
//            for (int j = 0; j < 3; j++) {
//                fila += num[i][j];
//            }
//            if (diag == fila) {
//                c++;
//            } 
//        }
//        for (int j = 0; j < 3; j++) {
//            hor = 0;
//            for (int i = 0; i < 3; i++) {
//                hor += num[i][j];
//            }
//            if (diag == hor) {
//                c++;
//            } 
//        }
//        if (c==7){
//            System.out.println("La Matriz es Magica!");
//        }
//    }
//}