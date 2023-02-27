package br.com.bootcampdio.sintaxejava.metodos;

import java.util.Calendar;
import java.util.Scanner;

/**
1. Calcule as 4 operacoes basicas basicas: soma, subtracao, divisao, e multiplicacao. Sempre 2 valores devem 
ser passados.



3. Calcule o valor final de um emprestimo, a partir do valor solicitado. Taxas e parcelas influenciam. 
Defina arbitrariamente, as faixas que influenciam nos valores.
 */


public class Calculadora {
    


      static void somarDoisNumeros(){
        Scanner scan = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Numero 1: ");
        numero1 = scan.nextInt();
        System.out.println("Numero 2: ");
        numero2 = scan.nextInt();
        double soma = numero1 + numero2;                           
        System.out.println("O valor da soma do numero 1 + numero 2 e: " + soma);
    }

      static void subtrairDoisNumeros(){
        Scanner scan = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Numero 1: ");
        numero1 = scan.nextInt();
        System.out.println("Numero 2: ");
        numero2 = scan.nextInt();
        double subtracao = numero1 - numero2;                           
        System.out.println("O valor da subtracao do numero 1 - numero 2 e: " + subtracao);
    }

      static void multiplicarDoisNumeros(){
        Scanner scan = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Numero 1: ");
        numero1 = scan.nextInt();
        System.out.println("Numero 2: ");
        numero2 = scan.nextInt();
        double multiplicacao = numero1 * numero2;                           
        System.out.println("O valor da multiplicacao do numero 1 X numero 2 e: " + multiplicacao);
    }


      static void divideDoisNumeros(){
        Scanner scan = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Numero 1: ");
        numero1 = scan.nextInt();
        System.out.println("Numero 2: ");
        numero2 = scan.nextInt();
        double divisao = numero1 / numero2;                           
        System.out.println("O valor da divisao do numero 1 pelo numero 2 e: " + divisao);
    }



      public static void main(String[] args) {
        somarDoisNumeros();
        subtrairDoisNumeros();
        multiplicarDoisNumeros();
        divideDoisNumeros();
      }
      
}



    

    
    
    
    

