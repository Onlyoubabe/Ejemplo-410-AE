/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Admin
 */
public class Auto {
    private String patente="aaaa";
    private int velocidad=20;
    private int marcha=1;
    private int velocidadMaxima=120;
    private int velocidadMaximaReversa=60;
    
    public int subirCambio(){
        if(marcha>=1 || marcha<6){
            marcha ++;
        }
        return marcha;
    }
    
        public int bajarCambio(){
        if(marcha>=1 || marcha<6){
            marcha --;
        }
        return marcha;
    }
        
        public int reversa(){
            marcha=6;
            return marcha;
        }
        
        public int acelerar(){
            if(marcha==-1 && velocidad<velocidadMaxima){
                velocidad ++;
            }
            if(velocidad>=0 && velocidad<velocidadMaxima){
                velocidad ++;
            }
            return velocidad;
        }
        
        public int frenar(){
            if (velocidad>=1){
                velocidad --;
            }
            return velocidad;
        }
        
        public String conocerMarcha(){
            String mensaje="";
            switch(marcha){
                case -1: mensaje="Va en reversa";break;
                case 1: mensaje="Va en primera";break;
                case 2: mensaje="Va en segunda";break;
                case 3: mensaje="Va en tercera";break;
                case 4: mensaje="Va en cuarta";break;
                case 5: mensaje="Va en quinta";break;
                case 6: mensaje="Va en sexta";break;
                
            }
            return mensaje;
        }
        
        public void velocidadViaja(){
            System.out.println("La velocidad a la que viaja el vehiculo es de " + velocidad + " kilometros");
        }
}
