package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 * @author Israel Poveda
 */
public class OperacionServicio {

    Scanner Leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion o1 = new Operacion();

        System.out.println("Ingrese el primer número: ");
        o1.setNumero1(Leer.nextFloat());
        System.out.println("Ingrese el segundo número: ");
        o1.setNumero2(Leer.nextFloat());

        return o1;

    }

    public float sumar(Operacion o1){
          
      return o1.getNumero1() + o1.getNumero2();
      
    } 
    
    public float restar(Operacion o1){
                
        return o1.getNumero1() - o1.getNumero2();
        
    }
    
    public float multiplicar(Operacion o1){
        
       
        
        if (o1.getNumero1()==0 || o1.getNumero2() == 0 ) {
           return 0;
           
        }else{
           return o1.getNumero1() * o1.getNumero2();
           
        }
        
        
    }
    
    public float dividir (Operacion o1){
        
        
        if (o1.getNumero1()==0 || o1.getNumero2() == 0 ) {
            return 0;
        }else{
           return (o1.getNumero1() / o1.getNumero2());
        }
        
        
    }
    
    
}
