/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasolli.lucas.menu;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class PasolliLucasMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int opcion = 1;
        Scanner nepe = new Scanner(System.in);       
        
        while(opcion!=5){
        
            System.out.println("1- Sumar\n2- Restar\n3- Multiplicar\n4- Dividir\n5- Salir");
            
            opcion = nepe.nextInt();
            
            switch (opcion){
                
                case 1:
                    System.out.println("Ingrese dos numeros");
                    
                    int suma1 = nepe.nextInt();
                    int suma2 = nepe.nextInt();
                    int suma = suma1 + suma2;
                    
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                
                case 2:
                    System.out.println("Ingrese dos numeros");
                    int resta1 = nepe.nextInt();
                    int resta2 = nepe.nextInt();
                    int resta = resta1 - resta2;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;    
                
                case 3:
                    System.out.println("Ingrese dos numeros");
                    int mult1 = nepe.nextInt();
                    int mult2 = nepe.nextInt();
                    int multiplicacion = mult1 * mult2;
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                    break;    
                
                case 4:
                    System.out.println("Ingrese dos numeros");
                    int div1 = nepe.nextInt();
                    int div2 = nepe.nextInt();
                    int division = div1 / div2;
                    System.out.println("El resultado de la division es: " + division);
                    break;
                    
                case 5:
                    System.exit(0);
                    break;
                    
                }
                    
                    
            }

        }
        
        
}
    

