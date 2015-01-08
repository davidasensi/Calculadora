/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author vesprada
 */
 import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner (System.in);
    int ope,a,b,c;
        //YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
        System.out.println("Calculadora Avanzada");
        System.out.println("Selecciona la operacion a realizar");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Raiz Cuadrada");
        System.out.println("6-Potencia");
        ope=teclado.nextInt();
        if(ope>6 || ope<1){
         System.out.println("Has introducido un numero no valido, PRINGA@");
        }
        System.out.println("Primer valor a operar");
        a=teclado.nextInt();
        System.out.println(";Segundo valor a operar");
        b=teclado.nextInt()
        switch (ope){
         case 1:
         c=a+b;
         System.out.println("El resultado de la suma es: "+c);
         break;
         case 2:
          c=a-b;
          System.out.println("El resultado de la resta es: "+c);
          break;
         
        }
        
    }//fin main
    
}//fin clase
