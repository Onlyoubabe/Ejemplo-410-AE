/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;

/**
 *
 * @author Admin
 */
public class Vehiculo {

    public static void main(String[] args) {
        Auto auto1=new Auto();
        System.out.println(auto1.conocerMarcha());
        auto1.subirCambio();
        System.out.println(auto1.conocerMarcha());
        auto1.velocidadViaja();
    }
}
