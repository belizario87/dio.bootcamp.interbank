package br.com.bootcampdio.sintaxejava.arrays;
/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class ExercicioArrays3 {
  public static void main(String[] args) {
      Random random = new Random();

      int numerosAleatorios[] = new int[20];
      System.out.print("Os numeros aleatorios sao: ");  
        for(int i = 0 ; i < numerosAleatorios.length ; i++) {
          int numero = random.nextInt(100);
          numerosAleatorios[i] = numero;
          System.out.print(numero + ", ");   
        }
      
      System.out.print("\nOs numeros sucessores sao: ");
        for( int numero : numerosAleatorios ) {
          System.out.print((numero + 1) + ", ");
        }
  }
}
      
      
     


