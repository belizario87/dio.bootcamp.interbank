
package br.com.bootcampdio.sintaxejava.fluxorepeticao;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ExercicioLoop4 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  Scanner qntNumeros = new Scanner(System.in);
  
  int numero;
  int n;
  int par = 0;
  int impar = 0;
  int count = 0;
  
  
  System.out.println("Digite a quantidade de numeros: ");
  n = qntNumeros.nextInt();  

    do {
      System.out.print("Digite um numero: ");
      numero = scan.nextInt();

       if( numero % 2 != 0 ){
                impar++;
            } else {
                par++;
            }
        
      count++;
    
    } while(n > count);
      
        System.out.println("Sao " + par + " numeros pares");
        System.out.println("Sao " + impar + " numeros impares");
  }
}
      
      
  
  
      
      
      

     




      

