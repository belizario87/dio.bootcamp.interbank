package br.com.bootcampdio.sintaxejava.fluxorepeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class ExercicioLoop6 {
  public static void main(String[] args) {
    int fatorial = 1;
    Scanner scan = new Scanner(System.in);
    int numero;
    System.out.println("Digite um numero para exibir seu fatorial: ");
    numero = scan.nextInt();
    
      for(int i = numero; i >= 1; i--) {
          fatorial *= i;
      }
    System.out.println(numero + "! = " + fatorial);
  }   
}



        
    
    
        
        
    
     

      
