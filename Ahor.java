/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniel Rodriguez
 * date 15/6/16
 */
public class Ahor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner scanner = new Scanner(System.in);
        String [] negro = {"avion","barco","computadora","dinosaurio","elefante","foca","gato","hielo","iguana","jabon"};
        
      
        int numeroRandom = new Random().nextInt(negro.length);
        
        String palabraEscogida = negro[numeroRandom];
       
        String[] palabra = new String[palabraEscogida.length()];
      
        int vidas = 11;
    }
    
}
