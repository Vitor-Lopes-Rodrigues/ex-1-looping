/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double num,result,i;
        System.out.println("Digite um número de 0 a 15:");
        num = entrada.nextDouble();
        i = 0;
        while(i <= 15)
        {
            result = Math.pow(3,i);
            System.out.println("O resultado da potencia de 3 é:" + result);
            i = i + 1;
        }
    }
    
}
