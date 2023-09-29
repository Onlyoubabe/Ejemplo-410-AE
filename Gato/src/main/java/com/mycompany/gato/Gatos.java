/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gato;
 import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Gatos {
    private char[][]tablero;
    private char turno;
    
    public Gatos(){
        tablero = new char[3][3];
        turno = 'X';
        iniciarTablero();
    }
    private void iniciarTablero(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
             tablero[i][j]= '-';   
            }
        }
    }
        public void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
