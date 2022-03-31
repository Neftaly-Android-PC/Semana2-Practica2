/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*2-. Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010 
utilizando la siguiente fórmula:

DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
Depreciación = Valor Vehículo en USA * 0.10

El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento 
el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores:

Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100. 
Imprimir los valores capturados así como el monto del DAI. 
 */
public class CalculoDelValorDaiParaUnVehiculo {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    NumberFormat num = new DecimalFormat("$#,###.##");
        
        double ValorUSA=5000, Depreciacion=0.10, Flete=700, Seguro=100;
        
        System.out.println("Valor del vehiculo en USA: $");
        ValorUSA = scan.nextDouble();
        System.out.println("Depreciacion: $");
        Depreciacion = scan.nextDouble();
        System.out.println("Valor del flete: $");
        Flete = scan.nextDouble();
        System.out.println("Valor del Seguro: $");
        Seguro = scan.nextDouble();
        
        double ValorDAI = obtenerDai(ValorUSA, Depreciacion, Flete, Seguro);
        
        System.out.println("Valor del DAI: " + num.format(ValorDAI));
    }
    
    public static double obtenerDai(double ValorUSA, double Depreciacion, double Flete, double Seguro){
        double DAI = 0;
        DAI = (ValorUSA - Depreciacion - Flete - Seguro) * 0.10;
        return DAI;
    }
}
