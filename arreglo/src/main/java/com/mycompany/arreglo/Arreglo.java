/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Arreglo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Clima clima = new Clima();

        for (int i=0; i<7; i++) {
            Temperatura t=new Temperatura();
            System.out.println("Ingresa la temperatura máxima del día: "+i);
            t.setMaxima(leer.nextFloat());
            System.out.println("Ingrese la temperatura mínima del día: "+i);
            t.setMinima(leer.nextFloat());
            clima.agregarTemperatura(i, t);
        }
        System.out.println("El promedio de las temperaturas maximas es de: " + clima.verPromedioMaxima());
        System.out.println("El promedio de las temperaturas mínimas es de: " + clima.verPromedioMinima());

    }
}

