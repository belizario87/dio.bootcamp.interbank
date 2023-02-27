package br.com.bootcampdio.sintaxejava.fluxorepeticao;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class ExercicioLoop5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual tabuada voce deseja ver? ");
    
    int multiplicador;
    int resultado;

    multiplicador = scan.nextInt();

      if(multiplicador > 0){
          for ( int i = 1; i - 1 < 10; i++ ){
            resultado = multiplicador * i;
            System.out.println(multiplicador + " X " + i + " = " + resultado); 
          }
      } else {
          System.out.println("Nao e possivel gerar uma tabuada com valores negativos, insira um numero valido");
      }
  }
}
    


  

  


