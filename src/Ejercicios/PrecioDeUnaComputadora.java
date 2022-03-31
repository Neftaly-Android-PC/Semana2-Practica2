/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

/*1-. Escriba un programa que imprima por pantalla cuánto le costará comprar una computadora a un determinado precio 
si sabe que puede conseguir una rebaja del 15%. No olvidar que al precio del artículo se le debe de agregar el IVA. El 
programa deberá permitir digitar el precio de la computadora y deberá de realizar los cálculos correspondientes.
 */

public class PrecioDeUnaComputadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat leer = new DecimalFormat("#,###.##");
        double precio, descuento=0.15, total;
        
        System.out.println("Ingrese el precio del artículo: $");
        precio = scan.nextDouble();
        
        
        double valorIVA = obtenerIva(precio, descuento);
        System.out.println("Descuento del artículo: " + descuento + "% de descuento");
        System.out.println("IVA: " + leer.format(valorIVA) + "%");
        
        total = precio - descuento - valorIVA;
        System.out.println("Precio total del artículo: $" + leer.format(total));
        
    }
    
    public static double obtenerIva(double precio, double descuento) {
        double iva = 0;
        iva = (precio - descuento) * 0.13;
        return iva;
    }

}
