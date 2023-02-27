package br.com.bootcampdio.sintaxejava.fluxorepeticao;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class ExercicioLoop2 {
  public static void main(String[] args) {
    int nota; 

    Scanner scan = new Scanner(System.in);
    System.out.println("Insira uma nota: ");
    nota = scan.nextInt();

      while( nota > 10 || nota < 0){
        System.out.println("Insira uma nota entra 0 e 10"); 
        System.out.print("Insira uma nota: ");
        nota = scan.nextInt();
    }
  }
}
   


  


  
