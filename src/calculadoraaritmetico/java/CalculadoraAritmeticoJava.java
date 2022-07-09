/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraaritmetico.java;

import java.util.Scanner;

/**
 *
 * @author Maria Jose
 */
public class CalculadoraAritmeticoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2,suma,resta,multi;
        double div;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE PRIMER VALOR ENTERO: ");
        num1 = leer.nextDouble();
        System.out.println("INGRESE SEGUNDO VALOR ENTERO: ");
        num2 = leer.nextDouble();
        
        suma = num1+num2;
        resta = num1-num2;
        multi = num1*num2;
        
        System.out.println("LA SUMA DE LOS VALORES ENTEROS ES: " + suma);
        System.out.println("LA RESTA DE LOS VALORES ENTEROS ES: " + resta);
        System.out.println("LA MULTIPLICACION DE LOS VALORES ENTEROS ES: "+multi);
        
        if(num2==0)
            System.out.println("NO EXISTE LA DIVISION ENTRE O");
        else 
        {
            div = num1/num2;
            System.out.println("LA DIVISION DE LOS VALORES ENTEROS ES: " + div);
        }
        
        }
         
           
        
                
        
        
                
                
        
    }
    

