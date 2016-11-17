
package boletin10_1;

import javax.swing.JOptionPane;


public class Juego {
    int num, contador;
  int  num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número a adiviñar: "));
  int numIntentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos: "));
   
 public void numero(){
     for(contador=1;contador<=numIntentos;contador++){
    
             num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (ente 1 e 50) : "));
       
            if(num1<num){
                System.out.println("Es menor");
            }
            else if (num1>num){
                System.out.println("Es mayor");
            }
            else if(num1==num){
            System.out.println("ACERTASTE");
            break;
            }
            }
             if (num1!=num){
            System.out.println("El número era: "+ num1);
     
             }
     
                 
     
       
          
 }      
}

