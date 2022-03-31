/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author nefta
 */
public class BilletesCinco {
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        String cantidadDinero;
        try{
            System.out.println("Cantidad:");
            cantidadDinero = leer.readLine(); //Lectura tipo String
            String cantidadCinco = BilletesCinco.obtenerBilletesDeCinco(cantidadDinero);
            System.out.println("Cantidad de billetes de $5.00: " + cantidadCinco);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static String obtenerBilletesDeCinco(String cantidadDinero){
    double montoDinero = Double.parseDouble(cantidadDinero); //Convertir a double
    int billetesCinco = (int) montoDinero/5; //Casting de double a int
    String resultado = String.valueOf(billetesCinco); //Casting a String
    return resultado;
        
    }
    
}
