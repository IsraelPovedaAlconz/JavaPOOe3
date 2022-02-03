/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidades.Operacion;
import Servicios.OperacionServicio;

/**
 *
 * @author Israel Poveda
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionServicio os = new OperacionServicio();
        
        Operacion o1 = os.crearOperacion();
        System.out.println("La suma de los dos números es: " + os.sumar(o1));
        System.out.println("La resta de los dos números: " + os.restar(o1));
        if (os.multiplicar(o1) == 0) {
             System.out.println("Como un número era 0 el resultado de multiplicar ambos numeros fue: " + os.multiplicar(o1));
        }else{
            System.out.println("El resultado de multiplicar ambos números fue: " + os.multiplicar(o1));
        }
      
        
        if (os.dividir(o1) == 0) {
             System.out.println("Como un número era 0 el resultado de dividir ambos numeros fue: " + os.dividir(o1));
        }else{
            System.out.println("El resultado de dividir ambos números fue: " + os.dividir(o1));
        }
        
    }
    
}
