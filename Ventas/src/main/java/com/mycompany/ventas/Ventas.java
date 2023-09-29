/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventas;

/**
 *
 */
public class Ventas {

    public static void main(String[] args) {
        Venta v=new Venta();
        v.poblar();
        v.imprimirTabla();
        System.out.println("Promedio total: " + v.promedio());
        float [] promedios = v.promedioAnual();
                
                for (int i = 0; i < promedios.length; i++){
                    System.out.println("Year" + i +  " = " + promedios[i]);
                }
                
        System.out.println("Año con peor venta por mes: " + v.peorVenta());
    }
    
}
