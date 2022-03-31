/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada.desde.teclado;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author nefta
 */
public class CalcularDai {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat lectura = new DecimalFormat("$#,###.##");
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la máquina:");
        valorMaquina = leer.nextDouble(); //Captura los datos en el tipo que se necesita
        System.out.println("Valor del flete:");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del Seguro:");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + lectura.format(valorDai));
        System.out.println("Valor del IVA: " + lectura.format(valorConIva));
    }
    //Crear el método para el calculo del Dai
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
        return dai;
    }
    
    //Método para obtener el valor mas IVA
    public static double obtenerIva(double dai){
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
        return pagoConIva;
            
    }
}
