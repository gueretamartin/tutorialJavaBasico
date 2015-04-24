/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoloops;
import java.util.Random;
import java.util.Scanner;
import static java. lang. System. out;



class JuegoAciertos {
    
    public static void main (String[] args)
    {  Scanner tomanum = new Scanner( System.in);
       int numIntentos=0;
       int numAleatorio = new Random().nextInt(10)+1;
       out. println("*************************************************");
       out. println("     Bienvenidos al juego de los aciertos");
       out. println("*************************************************");
       out. println("    Introduce un numero del 1 al 10        ");
       int numeroEscrito = tomanum. nextInt();
       numIntentos++;
       while(numeroEscrito!=numAleatorio){
           numIntentos++;
           System.out.println("El numero elegido es incorrecto");
           System.out.println("Elija otro: ");
            numeroEscrito = tomanum. nextInt();
     } System.out.println("Has acertado en el acierto: "+ numIntentos);
       
    }
               
     }
    
    
