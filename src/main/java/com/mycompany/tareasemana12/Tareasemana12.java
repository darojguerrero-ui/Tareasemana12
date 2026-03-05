/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareasemana12;

import java.util.Scanner;
/**
 *
 * @author Dario
 */
public class Tareasemana12 {

    public static void main(String[] args) {
        
       try (Scanner sc = new Scanner(System.in)){
     
        int[][] asientos = new int[3][4];

        int fila, columna;
        
        System.out.print("Ingrese la fila del asiento (0-2): ");
        fila = sc.nextInt();

        System.out.print("Ingrese la columna del asiento (0-3): ");
        columna = sc.nextInt();
       
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 4) {
            if (asientos[fila][columna] == 0) {
                asientos[fila][columna] = 1;
                System.out.println("Asiento reservado correctamente.");
            } else {
                System.out.println("Ese asiento ya está reservado.");
            }
        } else {
            System.out.println("Posición inválida.");
        }
        
        System.out.println("\nEstado de los asientos (0 = libre, 1 = reservado):");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
    }
