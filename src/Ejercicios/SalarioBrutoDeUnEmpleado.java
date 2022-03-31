/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/*5-. Escriba un programa para calcular el salario bruto de un empleado. Para calcular el salario del empleado debemos de hacer 
los descuentos por llegadas tardías así como la retención de la renta que es el 10% del salario menos el descuento por llegada 
tardía. Debe de crear una fórmula para determinar el salario por minuto y calcular el monto por las llegadas tardías y 
descontarlo al salario, luego debe de descontar el monto de la renta. El programa deberá permitir ingresar el nombre del
empleado, el salario mensual. El programa deberá de imprimir el nombre del empleado, el descuento por llegadas tardías, la 
retención de la renta y finalmente el salario bruto.

 */
public class SalarioBrutoDeUnEmpleado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = new DecimalFormat("#,###.##");
        double salarioBruto = 0, llegada_tarde = 0, descuento_tardio, renta = 0.10, procesoRenta, salarioMensual=0;
        String nombreEmp;
        
        System.out.println("Ingresar el nombre del empleado: ");
        nombreEmp=scan.next();
        System.out.println("Ingresar el salario mesual del empleado: $");
        salarioMensual=scan.nextDouble();
        System.out.println("Ingresar en valor monetario el descuento por llegadas tardes del empleado: $");
        llegada_tarde=scan.nextDouble();
        
        
        descuento_tardio = llegada_tarde - salarioBruto;
        procesoRenta = salarioMensual * renta;
        salarioBruto = salarioMensual - procesoRenta - descuento_tardio;
        
        System.out.println("Nombre del empleado: " + nombreEmp);
        System.out.println("Descuento por llegadas tardias: $ -" + nf.format(descuento_tardio));
        System.out.println("Retencion de renta: $ -" + nf.format(procesoRenta));
        System.out.println("Salario Bruto: $" + nf.format(salarioBruto));
    }
    
}
