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
public class MiSegundaAplicacionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se hace el llamado cada uno de los metodos creados
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
    public static void metodoConVoid(){
        System.out.println("Contenido del método con void");
        
    }
    
    public static int metodoConInt(){
        System.out.println("Contenido del método con int");
        return 0;
    }
    
    public static double metodoConDouble(){
        System.out.println("Contenido del método con double");
        return 0.0;
        
    }
    
    public static String metodoConString(){
        System.out.println("Contenido del método con string");
        return "";
    }
}
