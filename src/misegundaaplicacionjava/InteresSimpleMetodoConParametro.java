/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misegundaaplicacionjava;

/**
 *
 * @author nefta
 */
public class InteresSimpleMetodoConParametro {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo, tasaDeInteres;
        cantidadPrestada = 1500.00;
        tiempo = 0.75; //9 meses equivalente a 9/12 años = 2/4 ó 0,75
        tasaDeInteres = 0.08;
        //Envio de parámetros al método
        double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println("El interes es: $" + valorInteresSimple); //Muestra el resultado
        
    }
    public static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres){
        double interesSimple;
        interesSimple = cantidadPrestada * tiempo * tasaDeInteres; //Efectua la operación dentro del método
        return interesSimple;
    }
}
