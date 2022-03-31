/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

/*4-. Una empresa de venta de computadoras paga a su personal de ventas un salario de $300,00 más una comisión de 
$50,00 por computadora vendida. Diseñar un programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de computadoras vendidas. Al salario devengado se debe de retener el 10% en concepto de renta. Imprimir 
el nombre del vendedor, el salario devengado y la retención de la renta.
 */
public class SalarioDePersonalDeVentaDeComputadoras {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = new DecimalFormat("#,###.##");
        int computadoras_vendidas=0;
        double sueldo_total=0, total_venta=0, renta=0.10, procesoRenta;
        String nombre_vendedor;
        
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre_vendedor = scan.next();
        System.out.println("Ingrese la cantidad de computadoras vendidas: ");
        computadoras_vendidas = scan.nextInt();
        System.out.println("Ingrese el monto total de la venta del mes: ");
        total_venta = scan.nextDouble();
        
        sueldo_total = 300 + 50 * computadoras_vendidas * total_venta;
        procesoRenta = sueldo_total * renta;
        
        System.out.println("Nombre del vendedor: " + nombre_vendedor);
        System.out.println("Salario del mes: $" + nf.format(sueldo_total));
        System.out.println("Retenció de renta: $" + nf.format(procesoRenta));
    }
}
