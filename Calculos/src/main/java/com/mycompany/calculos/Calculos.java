/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculos;

/**
 *
 * @author Admin
 */
public class Calculos {

    public static void main(String[] args) {
            Calcular c1 = new Calcular();
            System.out.println(c1.elMayor(5,10));
            System.out.println(c1.elMenor(2, 3, 1));
            System.out.println("Numeros pares= "+c1.cantidadPares(10));
            System.out.println("sumatoria= "+ c1.sumatoria(10));
            System.out.println("Suma= "+c1.suma(5));
            System.out.println("Impares= "+c1.impares(1, 10));
    }
}
