/*programador: Nicolas Alfredo Jimenez
 * docente: Cesar Aceros 
 * fecha:
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factores1;

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class factorizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("introdusca numero :");


        Scanner sc = new Scanner(System.in); // introduccion del numero a evaluar 


        int num = sc.nextInt(); // numero guardado para evaluar
        int divisor = 2; // numero de divisor estándar predefinido
       
        
        System.out.print("Los factores del número " + num + " son: "); // imprime los valores primos
        
        while(num != 1) {
            if(num % divisor == 0){  // condicion del ciclo si el numero es divicible
                System.out.println(divisor+" ");
                num =num/divisor ;} // operacion 
            else {
                divisor++; // aumento del divisor 
            }
            
        }
  
    }
    
}
